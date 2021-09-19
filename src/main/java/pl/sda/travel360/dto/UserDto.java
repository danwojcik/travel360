package pl.sda.travel360.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    private String login;
    private String confirmEmail;
    private String phoneNumber;
    private String pesel;

}
