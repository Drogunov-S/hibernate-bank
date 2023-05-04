package ru.drogunov.hibernatebank.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.drogunov.hibernatebank.domain.dto.UserDto;
import ru.drogunov.hibernatebank.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UsersRestController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Long id,
                           @RequestParam(required = false, defaultValue = "false") Boolean card) {
        return userService.get(id, card);
    }

    @PostMapping
    public UserDto create(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }


}
