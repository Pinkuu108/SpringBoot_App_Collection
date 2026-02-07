package in.pinku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pinku.entity.Teacher;
import in.pinku.repository.TeacherReposatory;
import in.pinku.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		TeacherReposatory reposatory = run.getBean(TeacherReposatory.class);

		Teacher t = new Teacher();
		t.setTname("Santosh");
		t.setTsalary(109.0);

		reposatory.save(t);
		System.out.println("First Record Inserted......");
	}
}
