package in.codegram.codemarkerapplication.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "test name can not be empty")
	private String testName;
	@NotBlank(message = "test identifier can not be empty")
	@Size(min = 4, max = 5, message="test identifier must be in the range of 4 to 5 character")
	@Column(updatable=false, unique=true)
	private String testIdentifier;
	@NotBlank(message = "description can not be empty")
	private String description;
	private Date start_date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestIdentifier() {
		return testIdentifier;
	}
	public void setTestIdentifier(String testIdentifier) {
		this.testIdentifier = testIdentifier;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Date getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}
	public Date getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	private Date end_date;
	
	private Date created_At;
	private Date updated_At;
	
	@PrePersist
	public void onCreate() {
		this.created_At=new Date();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updated_At=new Date();
	}




}
