package services;

import model.Student;

public interface StudentService {
    Student createStudent(String name, int age);
    Student findStudentById(int id);
    void displayStudent(Student student);
}
