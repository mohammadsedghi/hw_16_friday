package Base.repository.impl;

import Base.entity.BaseEntity;
import Base.repository.BaseRepository;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>,ID extends Serializable>
        implements BaseRepository<E,ID> {
    private Session session;
    public BaseRepositoryImpl(Session session) {
        this.session=session;
    }

    @Override
    public BaseEntity save(BaseEntity entity) {
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        return null;
    }

    @Override
    public BaseEntity update(BaseEntity entity) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Optional findById(Serializable serializable) {
        return Optional.empty();
    }

    @Override
    public void remove(BaseEntity entity) {

    }
}
