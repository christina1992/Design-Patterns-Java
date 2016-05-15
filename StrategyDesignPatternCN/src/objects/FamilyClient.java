package objects;

import impl.PromotionType2;
import impl.ServicesType3;

public class FamilyClient extends Client {
	int familyMembers;

	public FamilyClient(String name, String surname, String startDate, double pricePerMinute, int familyMembers) {
		super(name, surname, startDate, pricePerMinute);
		this.familyMembers = familyMembers;
		promotion = new PromotionType2();
		service = new ServicesType3();
	}

	@Override
	public String displayInfo() {
		return "Name: " + this.name + " Surname: " + this.surname + " Start date: " + this.startDate + " Members: "
				+ this.familyMembers;
	}

	public void promote() {
		promotion.promote();
	}

	public void services() {
		service.services();
	}
}
