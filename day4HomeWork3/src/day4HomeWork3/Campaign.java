package day4HomeWork3;

public class Campaign {
	private String id;
	private int disCountRatio;
	private String name;
	public Campaign(String id, int disCountRatio, String name) {
		super();
		this.id = id;
		this.disCountRatio = disCountRatio;
		this.name = name;
	}
	public int getDisCountRatio() {
		return disCountRatio;
	}
	public void setDisCountRatio(int disCountRatio) {
		this.disCountRatio = disCountRatio;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
