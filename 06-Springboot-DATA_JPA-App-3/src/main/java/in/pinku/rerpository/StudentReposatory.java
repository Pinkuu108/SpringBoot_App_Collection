
package in.pinku.rerpository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.pinku.entity.Student;
import jakarta.transaction.Transactional;

@Repository
public interface StudentReposatory extends JpaRepository<Student, Integer> {
	// findBymethod
	// public List<Student> findByCity(String city);
	// public List<Student> findBySalaryGreaterThanEqual(long salary);

	// customQuarry
//	@Query(value ="select * from new_detiales",nativeQuery = true)
//	public List<Student> getAllStudents();
//
//	
//	@Query("From Student")
//	public List<Student> getStudents();

//	@Query("delete from Student where pkid = :pkid")
//	@Modifying
//	@Transactional
//	public void deleteStudent(Integer pkid);
//	@Modifying
//	@Transactional
////	@Query("DELETE FROM Student s WHERE s.pkid = :pkid")
//	void deleteStudent(int pkid);

	
	
}
