package day5Homework1.dataAccess.abstracts;

import java.util.List;

import day5Homework1.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(String id);
	Customer getWithEmail(String email);
	List<Customer> getAll();
}
