package main;

import impl.PromotionType1;
import objects.BasicClient;
import objects.BusinessType1Client;
import objects.BusinessType2Client;
import objects.FamilyClient;
import objects.PremiumClient;

public class ClientSimulator {

	public static void main(String[] args) {

		BasicClient basic = new BasicClient("Christina", "Nastevska", "15/05/2016", 60);
		BusinessType1Client businessType1Client = new BusinessType1Client("Mark", "Markson", "14/05/2016", 70);
		BusinessType2Client businessType2Client = new BusinessType2Client("Homer", "Simpson", "15/05/2016", 80);
		FamilyClient famulyClient = new FamilyClient("Marge", "Simpson", "14/05/2016", 100, 5);
		PremiumClient premiumClient = new PremiumClient("Bart", "Simpson", "15/05/2016", 150);

		System.out.println(basic.displayInfo());
		basic.setPromotion(new PromotionType1());
		basic.promotions();
		basic.services();

		System.out.println("\n");

		System.out.println(businessType1Client.displayInfo());
		businessType1Client.services();
		businessType1Client.promote();

		System.out.println("\n");

		System.out.println(premiumClient.displayInfo());
		premiumClient.promote();
		premiumClient.services();
		
		System.out.println("\n");
		
		System.out.println(famulyClient.displayInfo());
		famulyClient.promote();
		famulyClient.services();
		
		System.out.println("\n");
		
		System.out.println(businessType2Client.displayInfo());
		businessType2Client.services();
		businessType2Client.promote();
		

	}
}
