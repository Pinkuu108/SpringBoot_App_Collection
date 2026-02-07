package in.pinku.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.Role;

public interface RoleReposatory extends JpaRepository<Role, Long> {

}
