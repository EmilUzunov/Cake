package cakes;

import java.util.LinkedList;
import java.util.List;

public class Order extends AbstractWithPrice {

	private Client client;
	private String address;
	private List<Cake> cakes;
	private String dateAndTime;
	
	public Order(Client client,float price, String address,int CountOfCakes,String dateAndTime) {
		super(price);
		try{
			this.client = client;
			this.address = address;
			//TODO generate random cakes
			this.cakes = new LinkedList<Cake>();
			this.dateAndTime = dateAndTime;
			
		}catch(NullPointerException e){
			System.out.println("You will have to provide all the information about the order!");
		}
		
	}

}
