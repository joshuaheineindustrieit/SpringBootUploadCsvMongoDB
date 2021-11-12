package com.example.springboot.uploadcsv.mongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee {

	@Id

	private String name;

	private String department;

	private String job_position;

	private String start_date;

	private String end_date;
	
	public Employee (String name, String department,String job_position,String start_date, String end_date) {
		this.name = name;
		this.department=department;
		this.job_position = job_position;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob_position() {
		return job_position;
	}

	public void setJob_position(String job_position) {
		this.job_position = job_position;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", job_position=" + job_position + ", start_date=" + start_date + ", end_date=" + end_date +"]";
	}

}