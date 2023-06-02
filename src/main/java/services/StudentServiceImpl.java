package services;

import java.util.concurrent.atomic.AtomicInteger;

import model.Student;
import repositories.StudentRepository;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(String name, int age) {
        Student student = new Student(generateId(), name, age);
        studentRepository.save(student);
        return student;
    }

    
    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    public void displayStudent(Student student) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }

    private AtomicInteger idGenerator = new AtomicInteger(0);

    private int generateId() {
        return idGenerator.incrementAndGet();
    }



}

