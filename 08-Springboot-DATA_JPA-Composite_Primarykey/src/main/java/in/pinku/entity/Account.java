package in.pinku.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
@Entity
public class Account {
	private String name;
	private String branch;
	
	@EmbeddedId
	private AccountPk accountpk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public AccountPk getAccountpk() {
		return accountpk;
	}

	public void setAccountpk(AccountPk accountpk) {
		this.accountpk = accountpk;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", branch=" + branch + ", accountpk=" + accountpk + "]";
	}

	
	
	
}
