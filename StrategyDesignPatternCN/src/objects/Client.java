package objects;

import interfaces.PromotionInterface;
import interfaces.ServiceInterface;

/*
 *  Author: Christina Nastevska
 */

public abstract class Client {
	String name;
	String surname;
	String startDate;
	double pricePerMinute;
	PromotionInterface promotion;
	ServiceInterface service;

	public Client(String name, String surname, String startDate, double pricePerMinute) {
		super();
		this.name = name;
		this.surname = surname;
		this.startDate = startDate;
		this.pricePerMinute = pricePerMinute;
	}

	public abstract String displayInfo();

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public PromotionInterface getPromotion() {
		return promotion;
	}

	public void setPromotion(PromotionInterface promotion) {
		this.promotion = promotion;
	}

	public void services() {
		service.services();
	}

	public void promotions() {
		promotion.promote();
	}

}
