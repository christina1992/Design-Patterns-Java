package objects;

import impl.PromotionType1;
import impl.ServicesType1;

public class BusinessType1Client extends Client {

	public BusinessType1Client(String name, String surname, String startDate, double pricePerMinute) {
		super(name, surname, startDate, pricePerMinute);
		promotion = new PromotionType1();
		service = new ServicesType1();
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
