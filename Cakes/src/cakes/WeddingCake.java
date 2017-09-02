package cakes;

public class WeddingCake extends Cake {

	private WeddingCakesEnum size;
	private byte floars;

	public WeddingCake(float price, String name, String Description, byte numOfPeaces, WeddingCakesEnum size) {
		super(price, name, Description, numOfPeaces);
		this.size = size;
		this.floars = (byte)((Math.random()*2)+1);
	}

}
