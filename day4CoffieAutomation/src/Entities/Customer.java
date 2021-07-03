package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	public int Id;
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	public String nationalId;

	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}
}
