package day3Homework2;

public class Student extends User{
	private String[] enrolledCourses;
	
	
	public String[] getEnrolledCourses() {
		return enrolledCourses;
	}


	public void setEnrolledCourses(String[] enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}


	public Student(String name, String surName, String eMail, String id, 
			String gender, String birthDate,String[] enrolledCourses) {
		super(name, surName, eMail, id, gender, birthDate);
		this.enrolledCourses = enrolledCourses;
		
	}

}
