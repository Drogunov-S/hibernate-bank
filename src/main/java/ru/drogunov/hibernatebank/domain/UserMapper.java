package ru.drogunov.hibernatebank.domain;

import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import ru.drogunov.hibernatebank.common.BaseMapper;
import ru.drogunov.hibernatebank.common.LazyLoadingAwareMapper;
import ru.drogunov.hibernatebank.domain.dto.UserDto;
import ru.drogunov.hibernatebank.domain.entity.BankCard;
import ru.drogunov.hibernatebank.domain.entity.User;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserDto>, LazyLoadingAwareMapper {
    @Override
    User toEntity(UserDto dto);

    @Override
    List<User> toEntityList(Collection<UserDto> dtos);

    @Override
    UserDto toDto(User entity);

    @Override
    List<UserDto> toDtoList(Collection<User> entities);

    @Condition
    default boolean isNotLazyLoadedBankAccount(
            Collection<BankCard> sourceCollection) {
        return isNotLazyLoaded(sourceCollection);
    }
}
