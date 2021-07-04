package day4HomeWork3;

public class Sale {
	private String id;
	private String customerId;
	private String gameId;
	private int gamePrice;
	private int discountAmount;
	private int totalCost;
	
	public Sale(String id, String customerId, String gameId, int gamePrice, int discountAmount) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.gameId = gameId;
		this.gamePrice = gamePrice;
		this.discountAmount = discountAmount;
		this.totalCost = (gamePrice*(100-discountAmount))/100;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public String getId() {
		return id;
	}

	public String getGameId() {
		return gameId;
	}

	public int getGamePrice() {
		return gamePrice;

	}
	public int getDiscountAmount() {
		return discountAmount;
	}

	public int getTotalCost() {
		return totalCost;
	}

}
	
