package exo.getArrays.employeemanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageUrl;
	
	@Column(nullable=false, updatable = false)
	private String employeeCode;
	
	public Employee() {}
	
	public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode)
	{
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
		
		
	}
	
	
}
