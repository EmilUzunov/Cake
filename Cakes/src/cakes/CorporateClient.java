package cakes;

public class CorporateClient extends Client {

	private static final int INITIAL_PERCENTAGE_OF_DISCOUNT = 10;

	public CorporateClient(String name, String phone) {
		super(name, phone);

	}

	public void orderCakes() {
		final int numOfCakes = (int) ((Math.random() * 2) + 1);
		for (int i = 0; i < numOfCakes; i++) {
			// Cake cake = super.orderOneCake("St2");
		}
	}

}
