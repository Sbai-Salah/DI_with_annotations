package repositories;

import model.Student;

public interface StudentRepository {
    void save(Student student);
    Student findById(int id);
    void findAll();
}
