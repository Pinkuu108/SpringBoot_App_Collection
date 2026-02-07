package in.pinku.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SPRINGBOOT_ONE")
public class Student {
	
	@Id
	private Integer StdID;
	private String StdName;
	private Integer StdRollNo;
	private Integer StdMarks;
		

}
