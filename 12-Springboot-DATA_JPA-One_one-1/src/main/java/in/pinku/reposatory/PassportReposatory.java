package in.pinku.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.Passport;

public interface PassportReposatory extends JpaRepository<Passport, Integer> {

}
