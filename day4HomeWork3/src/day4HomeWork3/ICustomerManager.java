package day4HomeWork3;

public interface ICustomerManager {
	Customer add(Customer customer, BaseCustomerValidatior validator);
	void delete (Customer customer);
	void update(Customer customer);
}
