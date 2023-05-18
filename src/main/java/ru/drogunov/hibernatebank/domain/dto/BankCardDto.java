package ru.drogunov.hibernatebank.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.drogunov.hibernatebank.common.BaseDto;
import ru.drogunov.hibernatebank.domain.entity.BankCard;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link BankCard} entity
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BankCardDto extends BaseDto implements Serializable {
    private final String number;
    private final LocalDate validTo;
}
