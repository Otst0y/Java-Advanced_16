package lesson_16.JavaAdvanced_16;

import dao.CRUD;
import dao.Student;
import dao.StudentDaoConfiguration;
import dao.StudentDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(StudentDaoConfiguration.class, args);

		CRUD studentDao = (StudentDaoImpl) ctx.getBean("student");

		//create
		studentDao.create(new Student(0, "Andrew", 20));
		studentDao.create(new Student(1, "Peter", 25));
		studentDao.create(new Student(2, "Kate", 32));
		studentDao.create(new Student(3, "Bruce", 18));
		studentDao.create(new Student(4, "Konstantine", 27));

		//readAll
		studentDao.readAll().stream().forEach(System.out::println);

		//delete
		studentDao.delete(0);
		System.out.println();
		studentDao.readAll().stream().forEach(System.out::println);

		//update
		System.out.println();
		Student student0 = studentDao.read(0);
		studentDao.update(student0).setAge(26);
		System.out.println(student0);

		//read
		System.out.println();
		System.out.println(studentDao.read(0));
	}

}
