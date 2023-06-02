package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import repositories.InMemoryStudentRepository;
import repositories.StudentRepository;
import services.StudentService;
import services.StudentServiceImpl;
import services.StudentServiceMock;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    @Bean
    public StudentService studentServiceMock() {
        return new StudentServiceMock();
    }
}

