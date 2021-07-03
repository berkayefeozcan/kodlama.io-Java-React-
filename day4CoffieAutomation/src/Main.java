import java.util.Date;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager costumerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		costumerManager.save(new Customer(1,"Berkay Efe","Ozcan",new Date(2000,5,30),"123456789100"));
	}

}
