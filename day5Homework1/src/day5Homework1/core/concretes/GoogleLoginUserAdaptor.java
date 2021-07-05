package day5Homework1.core.concretes;

import day5Homework1.core.abstracts.ExternalLoginService;

public class GoogleLoginUserAdaptor implements ExternalLoginService{

	@Override
	public String login(String email, String pass) {
		// we suppose logins user wich id is 1 
		return "1";
	}

}
