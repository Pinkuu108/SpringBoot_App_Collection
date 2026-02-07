package Java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
// When u are came to Recall All Code ,You shoude Check Buttom to Top
class  Employee
{
    int id;
    String name;
    double salary;
    String dept;
    int age;
	public Employee(int id, String name, double salary, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", age=" + age + "]";
	}
    
}
public class EMPLOYEE_OBJECT_QUESTIONS_STREAMAPI {

	public static void main(String[] args) {
		List<Employee> list=Arrays.asList(
				new Employee(1,"PINKU",55000,"JAVA",23),
				new Employee(4,"CHINU",45000,"JAVA",22),
				new Employee(3,"LIZUN",30000,"GO",28),
				new Employee(2,"HAPPY",20000,"PYTHON",2),
				new Employee(5,"SUSANT",80000,"GO",32)
				
				);

		
		//Find youngest employee
		Employee employee = list.stream().min(Comparator.comparing(Employee::getAge)).get();
		//System.out.println(employee);
		
		
		//Count employees in each department
		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		//System.out.println(count);
		
		
		//Sort employees by salary
		//list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		
		
		//Find highest salary in each department
		Map<String, Optional<Employee>> maxsalary = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		//System.out.println(maxsalary);
		
				
		//Find average salary of employees
		double asDouble = list.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		//System.out.println(asDouble);
	
		
		
		
		//Question: Group employees by department
		Map<String, List<Employee>> dept = list.stream().collect(Collectors.groupingBy(Employee::getDept));
		//System.out.println(dept);
		
		
		
		
		//Find employee with highest salary
		Employee highest = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
		//System.out.println(highest);
		
		
		}
	}


