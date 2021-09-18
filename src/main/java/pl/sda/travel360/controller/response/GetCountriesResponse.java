package pl.sda.travel360.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.travel360.dto.CountryDto;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class GetCountriesResponse {

    private List<CountryDto> countries;
}
