package objects;

import impl.PromotionType2;
import impl.ServicesType2;

public class BusinessType2Client extends Client {

	public BusinessType2Client(String name, String surname, String startDate, double pricePerMinute) {
		super(name, surname, startDate, pricePerMinute);
		promotion = new PromotionType2();
		service = new ServicesType2();
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
