package day5Homework1.core.abstracts;

public interface CustomerInfoCheckerService {
	boolean checkEmailIsValid(String email);
	boolean checkPass(String pass);
	boolean checkFullName(String name,String surName);
}
