package in.pinku.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Teacher {
	
	@Id
	@TableGenerator(initialValue = 900,name = "Tid",table = "teacher_seq")
	//@GeneratedValue(strategy = GenerationType.TABLE,generator = "Tid")
	@GeneratedValue(strategy = GenerationType.)
	private Integer Tid;
	private String Tname;
	private Double Tsalary;
	public Teacher() {
		super();
	}
	public Teacher(Integer tid, String tname, Double tsalary) {
		super();
		Tid = tid;
		Tname = tname;
		Tsalary = tsalary;
	}
	public Integer getTid() {
		return Tid;
	}
	public void setTid(Integer tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public Double getTsalary() {
		return Tsalary;
	}
	public void setTsalary(Double tsalary) {
		Tsalary = tsalary;
	}

	
}
