package cakes;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import cakes.abstractAndEnums.AbstractWithPrice;
import cakes.client.Client;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cakes == null) ? 0 : cakes.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((dateAndTime == null) ? 0 : dateAndTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cakes == null) {
			if (other.cakes != null)
				return false;
		} else if (!cakes.equals(other.cakes))
			return false;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (dateAndTime == null) {
			if (other.dateAndTime != null)
				return false;
		} else if (!dateAndTime.equals(other.dateAndTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [client=" + client.toString() + ", address=" + address + ", cakes=" + cakes + ", dateAndTime=" + dateAndTime
				+ "]";
	}

}
