package repository.impl;

import entity.Student;
import repository.StudentRepository;

import java.util.List;
import java.util.Optional;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student update(Student entity) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Optional<Student> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void remove(Student entity) {

    }

    @Override
    public Student findByUserName(String lastname) {
        return null;
    }
}
