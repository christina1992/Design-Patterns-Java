package objects;

import impl.PromotionType3;
import impl.ServicesType4;

public class PremiumClient extends Client {

	public PremiumClient(String name, String surname, String startDate, double pricePerMinute) {
		super(name, surname, startDate, pricePerMinute);
		promotion = new PromotionType3();
		service = new ServicesType4();
	}

	@Override
	public String displayInfo() {
		return "Name: " + this.name + " Surname: " + this.surname + " Start date: " + this.startDate;
	}

	public void promote() {
		promotion.promote();
	}

	public void services() {
		service.services();
	}
}
