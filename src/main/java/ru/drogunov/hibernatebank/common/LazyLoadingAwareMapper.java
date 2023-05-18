package ru.drogunov.hibernatebank.common;

import org.hibernate.Hibernate;

import java.util.Collection;

public interface LazyLoadingAwareMapper {

    default boolean isNotLazyLoaded(Collection<?> collection) {
        return Hibernate.isInitialized(collection);
    }
}
