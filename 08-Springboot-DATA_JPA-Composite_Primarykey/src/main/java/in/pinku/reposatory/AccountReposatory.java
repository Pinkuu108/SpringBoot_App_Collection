package in.pinku.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.pinku.entity.Account;
import in.pinku.entity.AccountPk;

public interface AccountReposatory extends JpaRepository<Account, AccountPk>{
	
	
	//native sql querry
	@Query(value = "call getaccount()",nativeQuery = true)
	public List<Account> getAllaccount();

}
