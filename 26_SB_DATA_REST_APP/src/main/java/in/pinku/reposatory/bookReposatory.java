package in.pinku.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.pinku.entity.Book;
@RepositoryRestResource(path = "books")
public interface bookReposatory extends JpaRepository<Book, Integer> {

}
