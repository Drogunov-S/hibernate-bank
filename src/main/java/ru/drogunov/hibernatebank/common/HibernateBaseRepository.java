package ru.drogunov.hibernatebank.common;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public abstract class HibernateBaseRepository<E extends BaseEntity, ID> implements BaseRepository<E, ID>, AutoCloseable {

    private final SessionFactory sessionFactory;
    protected final Class<E> clazz;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void close() throws Exception {
        sessionFactory.close();
    }

    @Override
    public List<E> getAll() {
        String query = String.format("FROM %s", clazz.getSimpleName());
        return getSession().createQuery(query, clazz).getResultList();
    }

    @Override
    public E findById(ID id) {
        return getSession().find(clazz, id);
    }

    @Override
    public E find(E object) {
        return getSession().find(clazz, object);
    }

    @Override
    public E save(E object) {
        Session session = getSession();
        session.persist(object);
        session.flush();
        return object;
    }
}
