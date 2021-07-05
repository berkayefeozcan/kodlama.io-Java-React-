package day5Homework1.dataAccess.concretes;

import java.util.List;

import day5Homework1.dataAccess.abstracts.CustomerDao;
import day5Homework1.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+" veriTabanina eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" veriTabanindan silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" veri tabaninda guncellendi");
		
	}

	@Override
	public Customer get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getWithEmail(String email) {
		//if this function returns null , its means email is valid
		return null;
	}

}
