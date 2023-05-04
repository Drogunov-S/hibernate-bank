package ru.drogunov.hibernatebank.common;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BaseService<D extends BaseDto> {
    List<D> getAll();

    @Transactional
    D create(D dto);

    D get(Long id, Boolean flagCards);
}
