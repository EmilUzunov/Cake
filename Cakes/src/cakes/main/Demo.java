package cakes.main;

import cakes.client.Client;
import cakes.client.CorporateClient;
import cakes.client.CustomClient;

public class Demo {

	public static void main(String[] args) {
		CustomClient asen = new CustomClient("asen", "0897642323");
		asen.getAmountOfMoneyFromVauchers();
		
		Confectionery sladkarnica = new Confectionery("Sladkarnica", "08883327143");
		sladkarnica.printMenu();
		
		Client client = new CorporateClient("Misho", "088777665");
		client.orderCakes("st3");
		Client client1 = new CustomClient("Asen", "random one");
		client1.orderCakes("st2");
	}
}
