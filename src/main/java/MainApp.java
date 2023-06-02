import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ApplicationConfig;
import model.Student;
import repositories.StudentRepository;
import services.StudentService;
import services.StudentServiceMock;

public class MainApp {

	public static void main(String[] args) {
		   // ==========================================================
			        System.out.println("\n\n TP2: DI WITH ANNOTATION \n");
			        
			        
			        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
			        
			        StudentService studentMock = ctx.getBean("studentServiceMock", StudentServiceMock.class);
			        StudentService studentService = ctx.getBean("studentService", StudentService.class);
			        StudentRepository stdRepo = ctx.getBean("studentRepository", StudentRepository.class);
			        
			         
			        Student std1 = studentService.createStudent("Winter Autumn", 21);
			        studentService.displayStudent(std1);

			        Student std2 = studentService.createStudent("Spring Summer", 22);
			        studentService.displayStudent(std2);

			       
			        Student std_default = studentMock.createStudent("DEFAULT", 0);
			        studentMock.displayStudent(std_default);
			        
			        stdRepo.findAll();

			          
			        // SAVOIR QUELLES INSTANCES DE BEEN SONT CREERS
			        String[] beanNames = ctx.getBeanDefinitionNames();
			        System.out.println(beanNames.length+"-Created :) ");
			        for (String beanName : beanNames) {
			            System.out.println("==================");
			            System.out.println("Bean created: " + beanName);
			            System.out.println("==================");

			        }

			        ((AnnotationConfigApplicationContext) ctx).close();

	}

}
