package in.pinku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
