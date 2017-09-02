package cakes;

public class Cake extends AbstractWithPrice {
	
	private String name;
	private String description;
	private byte numOfPeaces;
	
	
	public Cake(float price, String name,String Description,byte numOfPeaces) {
		super(price);
		this.name = name;
		this.numOfPeaces = numOfPeaces;
		
	}

}
