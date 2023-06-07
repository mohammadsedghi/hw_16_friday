package repository.Impl;

import Base.repository.impl.BaseRepositoryImpl;
import entity.User;
import jakarta.persistence.Cacheable;
import org.hibernate.Session;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import repository.UserRepository;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Long> implements UserRepository  {
    public UserRepositoryImpl(Session session) {
        super(session);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }
}
