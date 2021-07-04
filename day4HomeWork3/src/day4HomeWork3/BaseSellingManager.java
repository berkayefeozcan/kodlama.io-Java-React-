package day4HomeWork3;

public class BaseSellingManager implements ISellingManager {
	Sale sales[] = {};
	
	@Override
	public void Sale(Game game , Customer customer,Campaign capmaign) {
		Sale sale = new Sale( Integer.toString(sales.length+1), customer.getId(),
				game.getId(), game.getPrice(), capmaign.getDisCountRatio());
		System.out.println(customer.getFirstName()+" isimli oyuncuya \""+
				capmaign.getName()+"\" isimli kampanya uygulanarak %"+
				sale.getDiscountAmount()+" oraninda indimle "+ game.getName() +
				" isimli " +game.getPrice()+" tl lik oyun " +sale.getTotalCost()+" tl ye satildi.");
	}

	@Override
	public day4HomeWork3.Sale getSale(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
