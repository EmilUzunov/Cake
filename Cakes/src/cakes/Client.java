package cakes;

import java.util.LinkedList;
import java.util.List;

public abstract class Client extends AbstractWithNameAndPhone {

	public Client(String name, String phone) {
		super(name, phone);
	}

	public Order orderCakes(String address) {
		
		List<Cake> cakes = new LinkedList<Cake>(); 
		int timesOfAddingCakes = 0;
		if(this instanceof CorporateClient){
			timesOfAddingCakes = (int)((Math.random()*2)+3);
		}if(this instanceof CustomClient){
			timesOfAddingCakes = (int) ((Math.random()*2)+1);
		}
		
		for (int i = 0; i < timesOfAddingCakes; i++) {
			final float typeOfTheCakeNumberGeneration = (float) Math.random();
			final float typeOfTheTypeGen = (float) Math.random();
		
		if (typeOfTheCakeNumberGeneration < 0.25) {
			if (typeOfTheTypeGen < 0.33) {
				cakes.add(SpecialCake.generateSpecialComercialCake());
			}
			if (typeOfTheTypeGen > 0.65) {
				cakes.add(SpecialCake.generateSpecialFirmCake());
			} else {
				cakes.add(SpecialCake.generateSpecialUbilaiCake());
			}
		}
		if (typeOfTheCakeNumberGeneration >= 0.25 && typeOfTheCakeNumberGeneration < 0.5) {
			if (typeOfTheTypeGen < 0.33) {
				cakes.add(ChildCake.generateChildBirthdayCake());
			}
			if (typeOfTheTypeGen > 0.65) {
				cakes.add(ChildCake.generateChildKrushteneFirmCake());
			} else {
				cakes.add(ChildCake.generateChildProshtapulnikCake());
			}
		}
		if (typeOfTheCakeNumberGeneration >= 0.5 && typeOfTheCakeNumberGeneration < 0.75) {
			if (typeOfTheTypeGen < 0.25) {
				cakes.add(StandartCake.generateStandartBisquidCake());
			}
			if (typeOfTheTypeGen >= 0.25 && typeOfTheTypeGen < 0.50) {
				cakes.add(StandartCake.generateStandartChocolateCake());
			}
			if (typeOfTheTypeGen >= 0.50 && typeOfTheTypeGen < 0.75) {
				cakes.add(StandartCake.generateStandartEclerCake());
			} else {
				cakes.add(StandartCake.generateStandartFruitCake());
			}
		}
		if (typeOfTheCakeNumberGeneration >= 0.75 && typeOfTheCakeNumberGeneration < 1) {
			if (typeOfTheTypeGen < 0.33) {
				cakes.add(WeddingCake.generateWeddingBigCake());
			}
			if (typeOfTheTypeGen > 0.65) {
				cakes.add(WeddingCake.generateWeddingMediumCake());
			} else {
				cakes.add(WeddingCake.generateWeddingBigCake());
			}
		}
	}
		Order order = new Order(this, address, "Some date and time.",cakes);
		System.out.println(order.toString());
		System.out.println(order.getPrice());
		return order;
	}

}
