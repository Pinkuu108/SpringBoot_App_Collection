package in.pinku.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.StudentEntity;

public interface StudentReposatory extends JpaRepository<StudentEntity, Integer>
{

}
