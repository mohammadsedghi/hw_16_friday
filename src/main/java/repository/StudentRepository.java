package repository;

import Base.entity.User;
import Base.repository.BaseRepository;
import entity.Student;

public interface StudentRepository extends BaseRepository<Student,Long> {

    Student findByUserName(String lastname);

}
