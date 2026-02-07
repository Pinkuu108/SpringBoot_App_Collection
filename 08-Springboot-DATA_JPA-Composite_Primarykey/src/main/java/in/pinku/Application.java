package in.pinku;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.pinku.entity.Account;
import in.pinku.entity.AccountPk;
import in.pinku.reposatory.AccountReposatory;

@SpringBootApplication
public class Application {

    private final AccountReposatory accountReposatory;

    Application(AccountReposatory accountReposatory) {
        this.accountReposatory = accountReposatory;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		AccountReposatory reposatory = run.getBean(AccountReposatory.class);
		
		
//		AccountPk ap=new AccountPk();
//		ap.setId(2);
//		ap.setActype("current");
//		ap.setAcno(67563);
//		
//		Account a=new Account();
//		a.setName("sabi");
//		a.setBranch("bbsr");
//		a.setAccountpk(ap);
//		
//		reposatory.save(a);
		
//		AccountPk ap=new AccountPk();
//		ap.setId(2);
//		ap.setActype("current");
//		ap.setAcno(67563);
//		Optional<Account> optional = reposatory.findById(ap);
//		System.out.println(optional.get());
		
		List<Account> allaccount = reposatory.getAllaccount();
		allaccount.forEach(System.out::println);
		System.out.println("Retrive Recored Inserted.......");
		
	}

}
