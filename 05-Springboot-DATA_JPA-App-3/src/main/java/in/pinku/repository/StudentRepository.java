package in.pinku.repository;

import org.springframework.data.repository.CrudRepository;

import in.pinku.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
