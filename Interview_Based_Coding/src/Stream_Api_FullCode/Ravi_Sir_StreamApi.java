package Stream_Api_FullCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;
	private double salary;
	private String gender;

	public Employee(String name, int age, double salary, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
	}

}

class EmployeeAdder {
	public static List<Employee> addDetails() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee("pinkuna", 23, 55000, "male");
		Employee emp2 = new Employee("chinu", 23, 35000, "female");
		Employee emp3 = new Employee("lizun", 28, 45000, "female");
		Employee emp4 = new Employee("bidyut", 55, 40000, "female");
		Employee emp5 = new Employee("santosh", 60, 70000, "male");
		Employee emp6 = new Employee("soham", 1, 33000, "male");
		Employee emp7 = new Employee("susant", 30, 80000, "male");
		Employee emp8 = new Employee("bapu", 22, 44000, "male");
		Employee emp9 = new Employee("mamina", 20, 74000, "female");
		Employee emp10 = new Employee("hrithik", 2, 54000, "male");

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);

		return list;
	}
}

public class Ravi_Sir_StreamApi {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	private static final String key = null;
	private static final String value = null;

	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

//		 1:: Filter Employess by gender
//		 Retrive a list of all female gender:
		 System.out.println(RED+"Retrive a list of all female gender:"+RESET);
		 list.stream().filter(t->t.getGender().equals("female")).forEach(System.out::println);

		// 2:: Filter Employye By Age:
		 System.out.println(RED+"*****Get a list of employees older than 30 years.********"+RESET);
		 list.stream().filter(a->a.getAge()>30).forEach(System.out::println);

		// 3:: Filter Employee by Salary::
		// System.out.println(RED+"*****Find employees with a salary greater than
		// $50,000.********"+RESET);
		// list.stream().filter(s->s.getSalary()>50000).forEach(System.out::println);

		// 4::Map Employee name
		// Create a list of Employee names(String)::
		// System.out.println(RED+"*************Create a list of employee names
		// (Strings)*************"+RESET);
		// list.stream().map(s1->s1.getName()).forEach(System.out::println);

		// 5. Calculate Average Salary:
		// - Calculate the average salary of all employees.
		// System.out.println(RED+"*********Calculate the average salary of all
		// employees.*******"+RESET);
		// double orElseThrow =
		// list.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
		// System.out.println("Average ::"+orElseThrow);

		// 6. Find Maximum Salary:
		// - Find the employee with the highest salary.
		// System.out.println(RED+"*********Find the employee with the highest
		// salary.********"+RESET);
		// double orElseThrow =
		// list.stream().mapToDouble(Employee::getSalary).min().orElseThrow();
		// System.out.println("Maximun Salary::"+orElseThrow);

		// 7.Group Employees by Gender:
		// - Group employees by gender and return
		// a map with gender as the key and a list of employees as the
		// System.out.println(RED+"******Group employees by gender and return a
		// map******"+RESET);
		// list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((key,Value)->System.out.println(key+"-"+Value));

		// 8. Count Male Employees:
		// - Count the number of male employees.
		// System.out.println(RED+"**********Count the number of male
		// employees.*********"+RESET);
		// long count =
		// list.stream().filter(Employee->Employee.getGender().equals("male")).count();
		// System.out.println("Count the number of male employees"+count);

		// 9. Sum of All Salaries:
		// - Calculate the total sum of salaries for all employees.
		// System.out.println(RED+"*********Calculate the total sum of salaries for all
		// employees.**********"+RESET);
		// double sum = list.stream().mapToDouble(Employee->Employee.getSalary()).sum();
		// System.out.println(sum);

		// 10. Sort Employees by Name:
		// - Sort the employees by their names in alphabetical order.
		// System.out.println(RED+"*******Sort the employees by their names in
		// alphabetical order.*****"+RESET);
		// list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(System.out::println);

		// 11. Sort Employees by Age:
		// - Sort the employees by age in ascending order.
		// System.out.println(RED + "**********Sort the employees by age in ascending
		// order.********" + RESET);
		// list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

		// 12. Sort Employees by Salary:
		// - Sort the employees by salary in descending order.
		// System.out.println(RED + "*********Sort the employees by salary in descending
		// order.******" + RESET);
		// list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

		// 13. Find Oldest Employee:
		// - Find the oldest employee.
		// System.out.println(RED + "*********Find the oldest employee.*********" +
		// RESET);
		// int orElseThrow =
		// list.stream().mapToInt(Employee::getAge).max().orElseThrow();
		// Employee employee = list.stream().max((e1, e2) -> e1.getAge() -
		// e2.getAge()).get();
		// System.out.println(employee);
		// System.out.println("MAx age:" + orElseThrow);

		// 14. Group Employees by Age:
		// - Group employees into age groups (e.g., 20-30, 31-40, etc.)
		// and return a map with age group as the key and a list of
		// employees as the value.
//		System.out.println(RED+"****Group employees into age groups (e.g., 	20-30, 31-40, etc.)*****"+RESET);
//		 list.stream()
//		 .collect(Collectors.groupingBy((t) ->
//		 {int age = t.getAge();
//		 if(age>=20 && age<=30)
//		 return "20-30";
//		 else if (age>=31 && age<=40)
//		 return "31-40";
//		 else
//		 return "40+";
//		 })).forEach((key,value)->
//		System.out.println(key+ " - "+value ));

//        15. Find Employees with a Specific Age:
//       - Find all employees who are exactly 35 years old.
//		System.out.println(
//				RED + "************ Find all employees who are 			exactly 35 years old.***********" + RESET);
//		list.stream().filter(s -> s.getAge() == 23).forEach(System.out::println);

		// 16. Calculate the Sum of Salaries by Gender:
		// - Calculate the sum of salaries for each gender (i.e., male and
		// and return a map with gender as the key and the sum of salaries
		// as the value.
		// System.out.println(RED + "********* Calculate the sum of salaries for each
		// gender**********" + RESET);
		// list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summingDouble(Employee::getSalary))).forEach((key,value)->System.out.println(key+"-"+value));

		// 17. Find Employees with Names Starting with "J":
		// - Find all employees whose names start with the letter "E."
		// System.out.println(RED+"*********Find all employees whose names start with
		// the letter J******"+RESET);
		// list.stream().filter(k->k.getName().startsWith("p")).forEach(System.out::println);

		// 18. Calculate the Average Salary for Male and Female Employees:
		// - Calculate the average salary separately for male
		// and female employees and return a map with gender
		// as the key and the average salary as the value.
//		System.out.println(
//				RED + "**********Calculate the average salary 		separately for male and female*********" + RESET);
//		list.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
//				.forEach((key, value) -> System.out.println(key + "-" + value));

		// 19. Find the Top N Highest Paid Employees:
		// - Find the top N employees with the highest salaries.
//		System.out.println(RED + "*******Find the top N employees with the highest salaries.********" + RESET);
//		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
//				.forEach(System.out::println);

		// 20. Retrieve Distinct Age Values:
		// - Get a list of distinct ages of all employees.
//		System.out.println(RED + "*********Get a list of distinct ages of all employees.*********" + RESET);
//       list.stream().filter(k ->! set.add(k.getAge())).forEach(System.out::println);

		// 21. Find the Three Lowest-Paid Employees:
		// - Find and display the names of the three employees with
		// the lowest salaries.
//		System.out.println(RED+ "*******Find and display the names of the 		three employees with the lowest salaries.********"	+ RESET);
//		list.stream().sorted((s1,s2)->(int)(s1.getSalary()-s2.getSalary())).map(d->d.getName()).limit(3).forEach(System.out::println);

		// 22. Sort Employees by Name Length:
		// - Sort employees by the length of their names (shortest to
//		System.out.println(RED+"***********Sort employees by the length of their names (shortest to longest).*******"+RESET);	
//		list.stream().sorted((p1,p2)->(p1.getName().length()-p2.getName().length())).forEach(System.out::println);

		// 23. Group Employees by Age Range:
		// - Group employees into custom
		// age ranges (e.g., 20-29, 30-39, etc.) and
		// return a map with the age range as the key and a list of
		// employees as the value.
//		System.out.println(RED + "*********Group employees into custom age 	ranges (e.g., 20-29, 30-39, etc.)*********"+ RESET);
//        list.stream()
//        .collect(Collectors.groupingBy((t)->
//        {int age=(t).getAge();
//        if(age>=20&&age<=29)
//        	return"20-29";
//        else if(age>=30&&age<=39)
//        	return"30-39";
//        else
//        	return "40+";}
//        		)).forEach((key,value)->System.out.println(key+"-"+value));

		// 24. Find the Average Salary of Employees Aged 30 or Younger:
		// - Calculate the average salary of employees aged 30 or Younger
//		System.out.println(RED+"********Calculate the average salary of employees aged 30 or younger.******"+RESET);
//		double orElseThrow = list.stream().filter(k->k.getSalary()>=30).mapToDouble(k->k.getSalary()).average().orElseThrow();
//		System.out.println(orElseThrow);

		// 25. Find the Names of Male Employees with Salaries Over $60,000:
		// - Retrieve the names of male employees with salaries over 60,000:
//		System.out.println(RED + "**********Retrieve the names of male employees with salaries over $53,000.***********" + RESET);
//		list.stream().filter(s -> s.getSalary() >= 60000).map(s -> s.getName()).forEach(System.out::println);

//		 26. Find the Youngest Female Employee:
//		   - Find the youngest female employee.
//		 System.out.println(RED+"**********Find the youngest female employee.**********"+RESET);
//		Employee employee = list.stream().filter(s->s.getGender().equals("female")).collect(Collectors.minBy((s1,s2)->s1.getAge()-s2.getAge())).get();
//		System.out.println(employee);
//		

//		 27. Retrieve the Names of Employees in Reverse Order:
//		   - Get a list of employee names in reverse order (from the 
//		last employee to the first).
//		System.out.println(RED + "******Get a list of employee names in	reverse order*******" + RESET);
//		List<String> collect = list.stream().map(k -> k.getName()).collect(Collectors.toList());
//		Collections.reverse(collect);
//		System.out.println(collect);

//		 28. Find the Highest Salary Among Female Employees:
//		   - Find the highest salary among female employees.
//		 System.out.println(RED+"******Find the highest salary among female employees."+RESET);
//		Employee employee = list.stream().filter(k->k.getGender().equals("female")).collect(Collectors.maxBy((p1,p2)->(int)(p1.getSalary()-p2.getSalary()))).get();
//		System.out.println(employee);

//		 29. Group Employees by Age and Gender:
//		   - Group employees by both age and gender and return a 
//		multi-level map.
//		System.out.println(
//				RED + "********Group employees by both age and gender and return a multi-level map.*****" + RESET);
//		Map<String, Map<Integer, List<Employee>>> collect = list.stream()
//				.collect(Collectors.groupingBy(Employee::getName, Collectors.groupingBy(Employee::getAge)));
//
//		collect.forEach((p, c) -> System.out.println(p + "-" + c));

//		 30. Find the Sum of Salaries for Employees with Names Containing 
//		   - Calculate the sum of salaries for employees whose names 
//		contain the substring "Smith."
//		 System.out.println(RED+"******* Calculate the sum of salaries for employees whose names contain the substring Smith***"+RESET);
//		double sum = list.stream().filter(s->s.getName().contains("sa")).mapToDouble(k->k.getSalary()).sum();
//		System.out.println(sum);

//		 31. Find the Names of Employees Aged 30-40 with Salaries Between 
//		$50,000 and $60,000:
//		   - Retrieve the names of employees aged 30-40 with salaries 
//		between $50,000 and $60,000.
//		 System.out.println(RED+"******Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.*******"+RESET);
//		 list.stream().filter(s->(s.getAge()>=20&&s.getAge()<=50)&&(s.getSalary()>=30000&&s.getSalary()<=60000)).forEach(System.out::println);

//		 32. Calculate the Total Number of Employees:
//		   - Determine the total count of employees.
//		 System.out.println(RED+"******** Determine the total count of employees.*******"+RESET);
//		long count = list.stream().count();
//		System.out.println("Total Number of Employee ::"+count);

//		 33. Find the Most Common Age Among Employees:
//		   - Determine the age that is most common among the 
//		System.out.println(RED + "******Determine the age that is most common among the employees.***" + RESET);
//		Integer orElseThrow = list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()))
//				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow();
//		System.out.println(orElseThrow);

//		   34. Find the Median Salary:
//			- Calculate the median salary of all employees.
//		System.out.println(RED + "********Calculate the median salary of all employees.******" + RESET);
//		List<Employee> list2 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
//		int size = list2.size();
//		if (size % 2 == 0) {
//			double s = list2.get(size / 2 - 1).getSalary();
//			double s1 = list2.get(size / 2).getSalary();
//			System.out.println((s + s1) / 2.0);
//		}
		

	}
}
