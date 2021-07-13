package com.adtservices.model;

public class Student {

	private int id;
	private String student_name;
	private String student_dob;
	private String student_doj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_dob() {
		return student_dob;
	}

	public void setStudent_dob(String student_dob) {
		this.student_dob = student_dob;
	}

	public String getStudent_doj() {
		return student_doj;
	}

	public void setStudent_doj(String student_doj) {
		this.student_doj = student_doj;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", student_name=" + student_name + ", student_dob=" + student_dob
				+ ", student_doj=" + student_doj + "]";
	}

	public Student(String student_name, String student_dob, String student_doj) {
		super();

		this.student_name = student_name;
		this.student_dob = student_dob;
		this.student_doj = student_doj;
	}

	public Student() {
		super();

	}

}
