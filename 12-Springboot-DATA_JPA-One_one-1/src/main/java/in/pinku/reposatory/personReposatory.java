package in.pinku.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.Person;

public interface personReposatory extends JpaRepository<Person, Integer> {

}
