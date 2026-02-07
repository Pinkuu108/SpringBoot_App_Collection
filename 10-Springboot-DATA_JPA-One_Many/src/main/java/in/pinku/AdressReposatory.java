package in.pinku;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinku.entity.Address;

public interface AdressReposatory extends JpaRepository<Address, Integer> {

}
