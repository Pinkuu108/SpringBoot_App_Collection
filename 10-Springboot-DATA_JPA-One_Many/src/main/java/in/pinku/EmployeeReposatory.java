package in.pinku;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.Employee;

public interface EmployeeReposatory extends JpaRepository<Employee, Integer> {

}
