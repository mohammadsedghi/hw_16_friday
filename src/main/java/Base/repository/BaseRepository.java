package Base.repository;

import Base.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseRepository<E extends BaseEntity<ID>, ID extends Serializable> {
    E save(E entity);
    E update(E entity);
    List<E> findAll();
    Optional<E> findById(ID id);
    void remove(E entity);


}
