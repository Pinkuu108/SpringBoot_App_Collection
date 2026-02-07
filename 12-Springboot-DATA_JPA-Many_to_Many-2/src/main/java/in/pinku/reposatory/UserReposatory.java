package in.pinku.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.User;

public interface UserReposatory extends JpaRepository<User, Long> {

}
