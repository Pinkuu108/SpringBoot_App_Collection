package in.pinku.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	// Custom query method to find a user by their email
	User findByEmail(String email);

}
