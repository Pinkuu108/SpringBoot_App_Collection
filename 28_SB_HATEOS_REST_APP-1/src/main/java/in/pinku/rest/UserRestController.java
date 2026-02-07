package in.pinku.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import in.pinku.binding.User;

@RestController
public class UserRestController {

    @GetMapping("/user")
    public ResponseEntity<User> getMethodName() {

        User u = new User(108, "chinu", "chinu108@gmail.com");

        
        u.add(
            WebMvcLinkBuilder
                .linkTo(WebMvcLinkBuilder
                .methodOn(UserRestController.class)
                .getMethodName())
                .withSelfRel()
        );
        
        return new ResponseEntity<>(u, HttpStatus.OK);
    }
}
