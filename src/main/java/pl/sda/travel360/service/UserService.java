package pl.sda.travel360.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.travel360.domain.User;
import pl.sda.travel360.dto.UserDto;
import pl.sda.travel360.mapper.UserMapper;
import pl.sda.travel360.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public List<UserDto> getAllUser() {
        log.info("Get users");
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public void addUser(UserDto userDto) {
        log.info("Add user: {}", userDto);
        User user = userMapper.mapToUser(userDto);
        userRepository.save(user);
    }
}
