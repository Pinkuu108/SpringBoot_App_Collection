package in.pinku;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pinku.entity.Address;
import in.pinku.entity.Employee;

@SpringBootApplication
public class Application {

    private final EmployeeReposatory employeeReposatory;

    private final AdressReposatory adressReposatory;

    Application(AdressReposatory adressReposatory, EmployeeReposatory employeeReposatory) {
        this.adressReposatory = adressReposatory;
        this.employeeReposatory = employeeReposatory;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		EmployeeReposatory bean = run.getBean(EmployeeReposatory.class);
		AdressReposatory reposatory = run.getBean(AdressReposatory.class);
		reposatory.findById(3);
		
//		Employee e=new Employee();
//		e.setEmpName("Pinku");
//		e.setEmpSalaary(45000);
//		
//		Address a=new Address();
//		a.setCity("Bdk");
//		a.setCountry("India");
//		a.setState("Odisha");
//		a.setEmp(e);
//		
//		Address a2=new Address();
//		a2.setCity("Bbsr");
//		a2.setCountry("India");
//		a2.setState("Odisha");
//		a2.setEmp(e);
//		
//		List<Address> asList = Arrays.asList(a,a2);
//		e.setAddr(asList);
//		
//		
//		bean.save(e);
		
		//bean.deleteById(2);	
	    //bean.findById(3);
//		
		System.out.println("Record inserted........");
	}

}
