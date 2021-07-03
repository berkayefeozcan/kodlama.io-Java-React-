package day3Homework2;

public class Instructor extends User {
	private String myCourses[];
	
	public Instructor(String name, String surName, String eMail,
		String id, String gender, String birthDate,String myCourses[]) {
		
		super(name, surName, eMail, id, gender, birthDate);
		this.setMyCourses(myCourses);
	
	}

	public String[] getMyCourses() {
		return myCourses;
	}

	public void setMyCourses(String myCourses[]) {
		this.myCourses = myCourses;
	}

	
}
