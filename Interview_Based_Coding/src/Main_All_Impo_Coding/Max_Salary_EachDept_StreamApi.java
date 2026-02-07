package Main_All_Impo_Coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
	String name;
	String dept;
	double salary;

	public Employee(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}

public class Max_Salary_EachDept_StreamApi {
	public static void main(String[] args) {
		List<Employee> employee= Arrays.asList(
				new Employee("A", "Java", 50000), 
				new Employee("B", "Java", 80000),
				new Employee("C", "Python", 70000),
				new Employee("D", "Python", 50000),
				new Employee("E", "GO", 58000));

				
		Map<String, Employee> result =
		        employee.stream()
		                .collect(Collectors.groupingBy(
		                        Employee::getDept,
		                        Collectors.collectingAndThen(
		                                Collectors.maxBy(
		                                        Comparator.comparing(Employee::getSalary)
		                                ),
		                                Optional::get
		                        )
		                ));

		System.out.println(result);
		        
	}

}
