package ru.drogunov.hibernatebank.common;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link ru.drogunov.hibernatebank.domain.entity.User} entity
 */
@Data
@RequiredArgsConstructor
public class BaseDto implements Serializable {
    private Long id;

}
