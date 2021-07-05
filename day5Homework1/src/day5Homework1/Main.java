package day5Homework1;

import day5Homework1.business.abstracts.CustomerService;
import day5Homework1.business.concretes.CustomerManager;
import day5Homework1.core.abstracts.CustomerInfoCheckerService;
import day5Homework1.core.abstracts.EmailVerificationService;
import day5Homework1.core.abstracts.ExternalLoginService;
import day5Homework1.core.concretes.CustomerInfoCheckerUtil;
import day5Homework1.core.concretes.EmailVerificationUtil;
import day5Homework1.core.concretes.GoogleLoginUserAdaptor;
import day5Homework1.dataAccess.abstracts.CustomerDao;
import day5Homework1.dataAccess.concretes.HibernateCustomerDao;
import day5Homework1.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("1","berkayefeozcan@gmail.com",
				"Berkay Efe","Ozcan","123456");
		CustomerInfoCheckerService customerInfoCheckerService = 
				new CustomerInfoCheckerUtil();
		EmailVerificationService emailVerificationService= new EmailVerificationUtil();
		CustomerDao customerDao = new HibernateCustomerDao();
		ExternalLoginService externalLoginService = new GoogleLoginUserAdaptor();
		CustomerService customerManager = new CustomerManager(customerDao,
				emailVerificationService, customerInfoCheckerService,externalLoginService);
		
		// check user info for validation		
		if(customerManager.validate(customer1)) {
			// we suppose user has  clicked to  verification link
			customerManager.add(customer1);
		}else {
			System.out.println("istenilen kullanici bilgileri formata uymadi");
		}
		
		customerManager.login("berkayefeozcan@gmail.com", "123456");
		
		
	}

}
