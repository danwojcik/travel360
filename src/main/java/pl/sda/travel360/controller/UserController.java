package pl.sda.travel360.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.travel360.controller.request.CreateUserRequest;
import pl.sda.travel360.controller.response.GetUserResponse;
import pl.sda.travel360.dto.UserDto;
import pl.sda.travel360.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping
    public GetUserResponse getUser() {
        List<UserDto> users = userService.getAllUser();
        return GetUserResponse.of(users);
    }


    @PostMapping
    public void createUser(@Valid @RequestBody CreateUserRequest request) {
        var userDto = UserDto.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .address(request.getAddress())
                .email(request.getEmail())
                .pesel(request.getPesel())
                .login(request.getLogin())
                .password(request.getPassword())
                .confirmEmail(request.getConfirmEmail())
                .phoneNumber(request.getPhoneNumber())
                .build();
        userService.addUser(userDto);
    }
}
