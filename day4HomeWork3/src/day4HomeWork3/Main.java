package day4HomeWork3;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game("0","PES",200);
		Customer customer = new Customer("0","Berkay Efe","Ozcan","434464646",new Date(2000,05,30));
		BaseCustomerValidatior validator = new EDevletValidator();
		customer = new BaseCustomerManager().add(customer, validator);
		BaseSellingManager sellingManager = new BaseSellingManager();
		Campaign campaign = new BaseCampaignManager().add(new Campaign("0",50,"yaz donemi indirim"));
		if(customer!=null) {
			sellingManager.Sale(game, customer, campaign);
		}else {
			System.out.println("kullanici kayit edilemedigi icin satis islemi gerceklesmedi");
		}
		
	}

}
