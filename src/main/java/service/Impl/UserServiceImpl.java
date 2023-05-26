package service.Impl;

import entity.Task;
import entity.User;
import entity.util.TaskStatus;
import org.hibernate.Session;
import repository.Impl.TaskRepositoryImpl;
import repository.Impl.UserRepositoryImpl;
import repository.TaskRepository;
import repository.UserRepository;
import util.HibernateUtil;

public class UserServiceImpl {
    Session session = HibernateUtil.getSessionFactory().openSession();
    UserRepository userRepository = new UserRepositoryImpl(session);
TaskRepository taskRepository=new TaskRepositoryImpl(session);
    public User signup(User user) {
        if (userRepository.findById(user.getId()).isPresent()) {
            userRepository.save(user);
            return user;
        } else throw new RuntimeException("this user is exist !");
    }
    public Task changeStatus(TaskStatus taskStatus,Task task){
        if (taskRepository.findById(task.getId()).isPresent()) {
            task.setTaskStatus(taskStatus);
            taskRepository.update(task);
            return task;
        } else {
            throw new RuntimeException("this task is not exist !");
            }
    }
}
