package in.pinku.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TABLE1")
public class Student {
	
	@Id
	private Integer id;
	private String name;
	@Column(name = "student_rank")
	private Long studentRank;

	private String gender;
	@Column(name="ACTIVE_SW")
	private String activeSW;
	
	@CreationTimestamp
	@Column(name="CREATE_DATE",updatable = false)
	private LocalDate createDate;
	
	@UpdateTimestamp
	@Column(name="UPDATE_DATE",updatable = false)
	private LocalDate updateDate;
	
    public Student()
    {
		super();
	}

	public Student(Integer id, String name, Long studentRank, String gender, String activeSW) {
		super();
		this.id = id;
		this.name = name;
		this.studentRank = studentRank;
		this.gender = gender;
		this.activeSW = activeSW;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(Long studentRank) {
		this.studentRank = studentRank;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getActiveSW() {
		return activeSW;
	}

	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	
    
    
 }
	
	
	

