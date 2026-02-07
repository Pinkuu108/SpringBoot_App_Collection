package in.pinku.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Detailes1")
public class Student {

	@Id
	private Integer stId;
	private String stName;
	private Long studentRank;
	private String stGender;
}
