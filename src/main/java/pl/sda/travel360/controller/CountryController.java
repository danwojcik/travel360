package pl.sda.travel360.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.travel360.controller.request.AddCountryRequest;
import pl.sda.travel360.controller.response.GetCountriesResponse;
import pl.sda.travel360.dto.CountryDto;
import pl.sda.travel360.service.CountryService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/country")
public class CountryController {

    private final CountryService service;

    @GetMapping
    public GetCountriesResponse getCountries() {
        List<CountryDto> countries = service.getAllCountry();
        return GetCountriesResponse.of(countries);
    }

    @PostMapping
    public void addCountry(@RequestBody AddCountryRequest request) {
        var countryDto = CountryDto.builder()
                .name(request.getCountry())
                .build();
        service.addCountry(countryDto);
    }
}
