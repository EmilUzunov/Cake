package cakes.client;

import java.util.LinkedList;
import java.util.List;

import cakes.Cake;
import cakes.Order;

public class CustomClient extends Client {

	private float amountOfMoneyFromVauchers;

	public CustomClient(String name, String phone) {
		super(name, phone);
		this.amountOfMoneyFromVauchers = generateAllVauchers();

	}

	public float getAmountOfMoneyFromVauchers() {
		return amountOfMoneyFromVauchers;
	}

	public int generateOneVaucher() {
		int sum = (int) ((Math.random() * 20) + 11);
		return sum;

	}

	public int generateAllVauchers() {
		int sum = 0;
		int numberOfVauchers = (int) ((Math.random() * 3) + 1);
		for (int i = 0; i < numberOfVauchers; i++) {
			sum += generateOneVaucher();
		}
		return sum;
	}

	@Override
	public String toString() {
		return "CustomClient [amountOfMoneyFromVauchers=" + amountOfMoneyFromVauchers + "]";
	}

	@Override
	public Order orderCakes(String address) {
		List<Cake> cakes = new LinkedList<Cake>();
		int timesOfAddingCakes = (int) ((Math.random() * 3) + 1);
		for (int i = 0; i < timesOfAddingCakes; i++) {
			final float typeOfTheCakeNumberGeneration = (float) Math.random();
			final float typeOfTheTypeGen = (float) Math.random();
			cakes.add(Cake.generateRandomCake());
		}
		Order order = new Order(this, address, "Some date and time.", cakes);
		System.out.println(order.getPrice());
		order.setPrice(order.getPrice()-amountOfMoneyFromVauchers);
		order.setPrice(order.getPrice()+order.getPrice()*0.02f);
		System.out.println(amountOfMoneyFromVauchers);
		System.out.println(order.getPrice());
		System.out.println(order.toString());
		return order;
	}
}
