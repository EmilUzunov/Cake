package cakes;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Order extends AbstractWithPrice {

	private Client client;
	private String address;
	private List<Cake> cakes;
	private String dateAndTime;
	
	public Order(Client client, String address,String dateAndTime, List<Cake> kakes) {
		super();
		try{
			this.client = client;
			this.address = address;
			//TODO generate random cakes
			this.cakes = new LinkedList<Cake>();
			this.cakes.addAll((Collection<? extends Cake>) Arrays.asList(kakes));
			this.dateAndTime = dateAndTime;
			for(Cake c: kakes){
				this.setPrice(this.getPrice()+ c.getPrice());
			}
			
		}catch(NullPointerException e){
			System.out.println("You will have to provide all the information about the order!");
		}
		
	}

	@Override
	public String toString() {
		return "Order [client=" + client.toString() + ", address=" + address + ", cakes=" + cakes + ", dateAndTime=" + dateAndTime
				+ "]";
	}

}
