package day4HomeWork3;

import java.util.Date;

public class Customer implements ICustomer{
	private String id;
	private String firstName;
	private String lastName;
	private String nationalId;
	private Date dateOfBirth;
	public Customer(String id, String firstName, String lastName, String nationalId, Date dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.dateOfBirth = dateOfBirth;
	}
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
}
