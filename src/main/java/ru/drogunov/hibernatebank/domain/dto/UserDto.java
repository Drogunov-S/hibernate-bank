package ru.drogunov.hibernatebank.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.drogunov.hibernatebank.common.BaseDto;
import ru.drogunov.hibernatebank.domain.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link User} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserDto extends BaseDto implements Serializable {
    private final String firstName;
    private final String lastName;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final List<BankCardDto> bankCard;
}
