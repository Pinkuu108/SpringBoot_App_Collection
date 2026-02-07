package in.pinku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.Teacher;

public interface TeacherReposatory extends JpaRepository<Teacher, Integer> {

}
