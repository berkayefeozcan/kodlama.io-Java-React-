package day5Homework1.business.abstracts;

import day5Homework1.entities.concretes.Customer;

public interface CustomerService {
	boolean validate(Customer customer);
	String add(Customer customer);
	String delete(String  id);
	String update(Customer customer);
	String logOut(String id);
	Customer login(String email,String password);
	Customer loginWithExternalSource(String email,String password);
	
}
