package ru.drogunov.hibernatebank.common;

import java.util.Collection;
import java.util.List;

public interface BaseMapper<E extends BaseEntity, D extends BaseDto> {

    E toEntity(D dto);

    List<E> toEntityList(Collection<D> dtos);

    D toDto(E entity);

    List<D> toDtoList(Collection<E> entities);

//    @Condition
//    default boolean isNotLazyBankCards() {
//    }

}
