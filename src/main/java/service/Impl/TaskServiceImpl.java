package service.Impl;

import entity.Task;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import repository.Impl.TaskRepositoryImpl;
import repository.TaskRepository;
import util.HibernateUtil;

import java.util.List;

public class TaskServiceImpl {
    Session session = HibernateUtil.getSessionFactory().openSession();
    TaskRepositoryImpl taskRepository = new TaskRepositoryImpl(session);

    public List<Task> sortAsc() {
       return taskRepository.sortAsc();
    }
}
