package day4HomeWork3;

public class BaseCampaignManager implements ICampaignManager {

	@Override
	public Campaign add(Campaign campaign) {
		System.out.println(campaign.getId() +" kampanyasi eklendi");
		return campaign;
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId() +" kampanyasi silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() +" kampanyasi guncellendi");
		
	}

	@Override
	public Campaign get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
