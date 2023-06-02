package repositories;

import java.util.HashMap;
import java.util.Map;

import model.Student;


public class InMemoryStudentRepository implements StudentRepository {
    private Map<Integer, Student> students;

    public InMemoryStudentRepository() {
        this.students = new HashMap<Integer, Student>();
    }

    public void save(Student student) {
        students.put(student.getId(), student);
        System.out.println(">>Student saved: " + student.getName());
    }

    public Student findById(int id) {
        return students.get(id);
    }

    public void findAll() {
    	System.out.println("-------INSIDE STUDENT REPOSITORY----------");
        for (Student student : students.values()) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("---------------------------");
        }
    }
}

