package services;

import model.Student;

public class StudentServiceMock implements StudentService {
    public Student createStudent(String name, int age) {
        return new Student(1, name, age);
    }

    public Student findStudentById(int id) {
        return null; // Not implemented for mock
    }

    public void displayStudent(Student student) {
        System.out.println("Mocked Student:");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
