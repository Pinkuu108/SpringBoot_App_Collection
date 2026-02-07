package in.pinku.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class User {
	@Id
	private Integer id;
	private String userName;
	 public User() {
	    }
	public User(Integer id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}
	

}
