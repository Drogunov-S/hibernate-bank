package ru.drogunov.hibernatebank.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.drogunov.hibernatebank.common.BaseMapper;
import ru.drogunov.hibernatebank.common.BaseService;
import ru.drogunov.hibernatebank.domain.dto.UserDto;
import ru.drogunov.hibernatebank.domain.entity.User;
import ru.drogunov.hibernatebank.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService implements BaseService<UserDto> {

    private final BaseMapper<User, UserDto> userMapper;
    private final UserRepository userRepository;

    @Override
    public List<UserDto> getAll() {
        return userMapper.toDtoList(userRepository.getAll());
    }

    @Override
    @Transactional
    public UserDto create(UserDto userDto) {
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDto)));
    }

    @Override
    public UserDto get(Long id, Boolean flagCards) {
        if (flagCards) {
            User byIdWithCards = userRepository.getByIdWithCards(id);
            return userMapper.toDto(byIdWithCards);
        } else {
            return userMapper.toDto(userRepository.findById(id));
        }
    }
}

