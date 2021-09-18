package pl.sda.travel360.mapper;

import org.springframework.stereotype.Service;
import pl.sda.travel360.domain.Country;
import pl.sda.travel360.dto.CountryDto;

@Service
public class CountryMapper {

    public CountryDto mapToDTO(Country country) {
        return CountryDto.builder()
                .id(country.getId())
                .name(country.getName())
                .build();
    }

    public Country mapToCountry(CountryDto countryDto) {
        return Country.builder()
                .name(countryDto.getName())
                .build();
    }
}
