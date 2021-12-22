package com.student.management;

public class student {
	
	private int student_id;
	private String student_name;
	private String student_city;
	private String student_phone;
	
	
// Getters and setters
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_city() {
		return student_city;
	}

	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}

	public String getStudent_phone() {
		return student_phone;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	
	
	public student(int student_id, String student_name, String student_city, String student_phone) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_city = student_city;
		this.student_phone = student_phone;
	}
	
	public student(String student_name, String student_city, String student_phone) {
		super();
		this.student_name = student_name;
		this.student_city = student_city;
		this.student_phone = student_phone;
	}

	
	public student() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "student [student_id=" + student_id + ", student_name=" + student_name + ", student_city=" + student_city
				+ ", student_phone=" + student_phone + "]";
	}
	
}
