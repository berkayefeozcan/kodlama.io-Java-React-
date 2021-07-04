package day4HomeWork3;

public interface ICampaignManager {
	Campaign add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	Campaign get ( String id);
	
}
