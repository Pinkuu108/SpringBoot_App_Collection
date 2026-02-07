package Collection;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class Sort_Employee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "A");
		Employee e2 = new Employee(9, "D");
		Employee e3 = new Employee(5, "R");
		Employee e4 = new Employee(3, "P");
		List<Employee> l = new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);

		l.stream().sorted((a, b) -> a.getName().compareTo(b.getName()));
		for (Employee employee : l) {
			System.out.println(employee);

		}
	}
}
