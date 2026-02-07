package in.pinku.repository1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.pinku.entity.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{
	

}
