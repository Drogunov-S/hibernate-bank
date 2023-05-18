package ru.drogunov.hibernatebank.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.drogunov.hibernatebank.common.HibernateBaseRepository;
import ru.drogunov.hibernatebank.domain.entity.User;

@Repository
@Transactional(readOnly = true)

public class UserRepository extends HibernateBaseRepository<User, Long> {

    public UserRepository(SessionFactory sessionFactory) {
        super(sessionFactory, User.class);
    }

    public User getByIdWithCards(Long id) {
        Session session = getSession();
        session.enableFetchProfile("cards");
        return session.find(clazz, id);
    }
}
