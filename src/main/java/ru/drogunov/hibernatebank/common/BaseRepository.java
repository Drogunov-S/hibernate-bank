package ru.drogunov.hibernatebank.common;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface BaseRepository<E extends BaseEntity, ID> {

    List<E> getAll();

    E findById(ID id);

    E find(E object);

    @Transactional
    E save(E object);
}
