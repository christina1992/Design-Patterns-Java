package objects;

import impl.ServicesType1;

public class BasicClient extends Client {

	public BasicClient(String name, String surname, String startDate, double pricePerMinute) {
		super(name, surname, startDate, pricePerMinute);
		service = new ServicesType1();
	}

	@Override
	public String displayInfo() {
		return "Name: " + this.name + " Surname: " + this.surname + " Start date: " + this.startDate;
	}

}
