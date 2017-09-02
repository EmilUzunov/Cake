package cakes;

public class Demo {

	public static void main(String[] args) {
		CustomClient asen = new CustomClient("asen", "0897642323");
		asen.getAmountOfMoneyFromVauchers();
		
		Confectionery sladkarnica = new Confectionery("Sladkarnica", "08883327143");
		sladkarnica.printMenu();
		
		Client client = new CustomClient("Misho", "088777665");
		client.orderCakes("St3");
	}
}
