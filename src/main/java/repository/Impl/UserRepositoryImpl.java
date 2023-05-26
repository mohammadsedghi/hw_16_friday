package repository.Impl;

import Base.repository.impl.BaseRepositoryImpl;
import entity.User;
import org.hibernate.Session;
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
