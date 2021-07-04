package day4HomeWork3;

public class BaseCustomerManager implements ICustomerManager{

	@Override
	public Customer add(Customer customer, BaseCustomerValidatior validator) {
		if(validator.checkCustomer(customer)) {
			
			System.out.println("sisteme "+customer.getFirstName()+" eklendi");
			return customer;
		}else {

			System.out.println("sisteme "+customer.getFirstName()+" eklenemedi");
			return null;
		}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("sistemden "+customer.getFirstName()+" silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("sistemde "+customer.getFirstName()+" bilgileri guncellendi");
		
	}









}
