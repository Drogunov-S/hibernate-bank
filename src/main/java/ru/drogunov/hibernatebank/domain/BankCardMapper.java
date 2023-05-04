package ru.drogunov.hibernatebank.domain;

import org.mapstruct.Mapper;
import ru.drogunov.hibernatebank.common.BaseMapper;
import ru.drogunov.hibernatebank.domain.dto.BankCardDto;
import ru.drogunov.hibernatebank.domain.entity.BankCard;

@Mapper(componentModel = "spring")
public interface BankCardMapper extends BaseMapper<BankCard, BankCardDto> {

}
