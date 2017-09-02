package cakes;

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
		int sum = (int)((Math.random() * 20) + 11);
		return  sum;
		
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
}
