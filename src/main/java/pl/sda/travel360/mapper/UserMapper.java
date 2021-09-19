package pl.sda.travel360.mapper;

import org.springframework.stereotype.Service;

import pl.sda.travel360.domain.User;

import pl.sda.travel360.dto.UserDto;

@Service
public class UserMapper {

    public UserDto mapToDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .address(user.getAddress())
                .email(user.getEmail())
                .login(user.getLogin())
                .confirmEmail(user.getConfirmEmail())
                .pesel(user.getPesel())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }

    public User mapToUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .address(userDto.getAddress())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .login(userDto.getLogin())
                .pesel(userDto.getPesel())
                .confirmEmail(userDto.getConfirmEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .build();
    }
}
