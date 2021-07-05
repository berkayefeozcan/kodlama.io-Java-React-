package day5Homework1.core.concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Homework1.core.abstracts.CustomerInfoCheckerService;

public class CustomerInfoCheckerUtil implements CustomerInfoCheckerService {
	
	private final String regex =  "^[A-Za-z0-9+_.-]+@(.+)$";
	private Pattern pattern = Pattern.compile(regex);
	
	@Override
	public boolean checkEmailIsValid(String email) {
		Matcher matcher = this.pattern.matcher(email);
		return matcher.matches();
	}

	@Override
	public boolean checkPass(String pass) {		
		return pass.length()>=6;
	}

	@Override
	public boolean checkFullName(String name, String surName) {
		return name.length()>2 && surName.length()>2;
	}
	
}
