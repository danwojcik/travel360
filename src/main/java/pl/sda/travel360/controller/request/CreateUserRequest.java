package pl.sda.travel360.controller.request;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CreateUserRequest {

    private Long id;

    @NotNull
    @NotEmpty
    private String login;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    @Size(min = 8, max = 32)
    private String password;

    @Email
    @NotEmpty
    private String email;

    @Pattern(regexp = "(?<!\\w)(\\(?(\\+|00)?48\\)?)?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)")
    private String phoneNumber;

    @NotEmpty
    private String pesel;

    @NotEmpty
    private String address;

    private String confirmEmail;

}
