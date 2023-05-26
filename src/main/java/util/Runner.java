package util;

import entity.Task;
import entity.User;
import entity.util.TaskStatus;
import org.hibernate.Session;
import repository.Impl.TaskRepositoryImpl;
import repository.Impl.UserRepositoryImpl;
import repository.TaskRepository;
import repository.UserRepository;
import service.Impl.TaskServiceImpl;
import service.Impl.UserServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Session session1= HibernateUtil.getSessionFactory().openSession();
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        UserRepository userRepository1 = new UserRepositoryImpl(session1);
        UserRepository userRepository2 = new UserRepositoryImpl(session2);
        TaskRepository taskRepository = new TaskRepositoryImpl(session1);
        UserServiceImpl userService = new UserServiceImpl();
        TaskServiceImpl taskService=new TaskServiceImpl();

        System.out.println(userRepository1.findById(1l));
        System.out.println(userRepository2.findById(1l));
      // System.out.println( session.find(User.class,1l));
      // System.out.println( session.find(User.class,1l));
       // session.find(User.class,1l);
     //   session.find(User.class,1l);


//
//        Task task = new Task();
//        task.setDescription("first task");
//        task.setDeadline(LocalDate.of(2024,10,10));
//        task.setTitle("computer");
//
//        Task task1 = new Task();
//        task1.setDescription("second task");
//        task1.setDeadline(LocalDate.of(2026,11,20));
//        task1.setTitle("cpu");
//
//        List<Task> tasks = new ArrayList<>();
//        tasks.add(task);
//        tasks.add(task1);
//        User user = new User("mohammad", "sedghi", tasks);
//        task.setUser(user);
//        task1.setUser(user);
//        userRepository.save(user);
//         taskRepository.save(task);
//         taskRepository.save(task1);


//        userService.changeStatus(TaskStatus.COMPLETED, task);
//        userService.changeStatus(TaskStatus.COMPLETED, task1);
//        taskService.sortAsc().forEach(System.out::println);
    }
}
