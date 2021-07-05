package day5Homework1.core.concretes;

import day5Homework1.core.abstracts.EmailVerificationService;

public class EmailVerificationUtil implements  EmailVerificationService {	

	

	@Override
	public void sendVerificationEmail(String Email) {
		System.out.println("Kullanici dogrulama emaili gonderildi");
		
	}
	
}
