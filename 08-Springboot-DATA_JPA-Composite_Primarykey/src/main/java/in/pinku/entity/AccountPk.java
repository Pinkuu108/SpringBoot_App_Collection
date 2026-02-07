package in.pinku.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
@Embeddable
public class AccountPk implements Serializable { 
	
	
	private Integer id;
	private String actype;
	private Long acno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getActype() {
		return actype;
	}
	public void setActype(String actype) {
		this.actype = actype;
	}
	public Long getAcno() {
		return acno;
	}
	public void setAcno(long i) {
		this.acno = i;
	}
	@Override
	public String toString() {
		return "AccountPk [id=" + id + ", actype=" + actype + ", acno=" + acno + "]";
	}
	
	

}
