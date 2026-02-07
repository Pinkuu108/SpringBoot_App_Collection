package in.pinku;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pinku.entity.Role;
import in.pinku.entity.User;
import in.pinku.reposatory.RoleReposatory;
import in.pinku.reposatory.UserReposatory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserReposatory userRepo = context.getBean(UserReposatory.class);
		RoleReposatory roleRepo = context.getBean(RoleReposatory.class);
		  // Create roles
        Role roleAdmin = new Role();
        roleAdmin.setRoleName("ADMIN");

        Role roleUser = new Role();
        roleUser.setRoleName("USER");

        // Save roles first
        roleRepo.save(roleAdmin);
        roleRepo.save(roleUser);

        // Create users
        User user1 = new User();
        user1.setUserName("Pinku");

        User user2 = new User();
        user2.setUserName("Ravi");

        // Assign roles to users
        Set<Role> roles1 = new HashSet<>();
        roles1.add(roleAdmin);
        roles1.add(roleUser);
        user1.setRoles(roles1);

        Set<Role> roles2 = new HashSet<>();
        roles2.add(roleUser);
        user2.setRoles(roles2);

        // Save users (this will also populate the join table)
        userRepo.save(user1);
        userRepo.save(user2);

        System.out.println("✅ Data inserted successfully!");
	}

}
 