package cakes.client;

import java.util.LinkedList;
import java.util.List;

import cakes.Cake;
import cakes.Order;

public class CorporateClient extends Client {

	private static final int INITIAL_PERCENTAGE_OF_DISCOUNT = 10;

	public CorporateClient(String name, String phone) {
		super(name, phone);

	}

	

	@Override
	public Order orderCakes(String address) {

		List<Cake> cakes = new LinkedList<Cake>();
		int timesOfAddingCakes = (int) ((Math.random() * 2) + 3);

		for (int i = 0; i < timesOfAddingCakes; i++) {
			final float typeOfTheCakeNumberGeneration = (float) Math.random();
			final float typeOfTheTypeGen = (float) Math.random();
			cakes.add(Cake.generateRandomCake());
		}
		Order order = new Order(this, address, "Some date and time.", cakes);
		
		
		int discount = (int) ((Math.random() * 10) + 6) + INITIAL_PERCENTAGE_OF_DISCOUNT;
		System.out.println(discount);
		System.out.println(order.getPrice());
		order.setPrice(order.getPrice() - (discount * 0.01f) * order.getPrice());
		System.out.println(order.getPrice());
		order.setPrice(order.getPrice() + (5 * 0.01f) * order.getPrice());
		System.out.println(order.getPrice());
		

		
		return order;
	}

}
