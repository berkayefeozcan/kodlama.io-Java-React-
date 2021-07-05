package day5Homework1.business.concretes;

import day5Homework1.business.abstracts.CustomerService;
import day5Homework1.core.abstracts.CustomerInfoCheckerService;
import day5Homework1.core.abstracts.EmailVerificationService;
import day5Homework1.core.abstracts.ExternalLoginService;
import day5Homework1.dataAccess.abstracts.CustomerDao;
import day5Homework1.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	private CustomerDao customerDao;
	private EmailVerificationService emailverSer;
	private CustomerInfoCheckerService customerInfoCheckerService;
	private ExternalLoginService externalLoginService;
	public CustomerManager(CustomerDao customerDao, EmailVerificationService emailverSer,
			CustomerInfoCheckerService customerInfoCheckerService,
			ExternalLoginService externalLoginService) {
		super();
		this.customerDao = customerDao;
		this.emailverSer = emailverSer;
		this.customerInfoCheckerService = customerInfoCheckerService;
		this.externalLoginService = externalLoginService;
	}

	@Override
	public boolean validate(Customer customer) {
		boolean isEmailExists = customerDao.getWithEmail(customer.getEmail()) != null;
		boolean fullNameIsValid = customerInfoCheckerService.
				checkFullName(customer.getFirstName(),customer.getLastName());
		boolean emailIsValid = customerInfoCheckerService.
				checkEmailIsValid(customer.getEmail());
		boolean passwordIsValid= customerInfoCheckerService.
				checkPass(customer.getPassword());
		
		if(!isEmailExists && fullNameIsValid && emailIsValid && passwordIsValid) {
			emailverSer.sendVerificationEmail(customer.getEmail());
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String add(Customer customer) {
		customerDao.add(customer); 
		return "Kullanici sisteme eklendi";
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer login(String email, String password) {
		Customer customer = customerDao.getWithEmail(email);
		if(customer!=null && customer.getPassword()==password) {
			System.out.println("sisteme "+customer.getFirstName()+"giris yapti");
			return customer;
		}else {
			System.out.println("Parola ya da email hatali");
			return null;
		}
	}

	@Override
	public String logOut(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer loginWithExternalSource(String email, String password) {
		// this func is open to development
		this.externalLoginService.login(email, password);
		return null;
	}

}
