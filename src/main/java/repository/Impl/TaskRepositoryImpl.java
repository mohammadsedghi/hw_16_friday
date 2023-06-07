package repository.Impl;

import Base.repository.impl.BaseRepositoryImpl;
import entity.Task;
import jakarta.persistence.Cacheable;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import repository.TaskRepository;

import java.util.List;

public class TaskRepositoryImpl extends BaseRepositoryImpl<Task,Long>implements TaskRepository {
   private final Session session;
    public TaskRepositoryImpl(Session session) {
        super(session);
        this.session=session;
    }

    @Override
    public Class<Task> getEntityClass() {
        return Task.class;
    }
    public List<Task> sortAsc(){
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Task> cr = cb.createQuery(Task.class);
        Root<Task> root = cr.from(Task.class);
        cr.select(root);
        cr.orderBy(
                cb.asc(root.get("deadline")),
                cb.desc(root.get("title")));
        TypedQuery<Task> query = session.createQuery(cr);
        return query.getResultList();
    }


}
