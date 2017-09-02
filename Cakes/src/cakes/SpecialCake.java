package cakes;

public class SpecialCake extends Cake {

	private SpecialCakeEnum type;
	private String nameOfEvent;

	public SpecialCake(float price, String name, String Description, byte numOfPeaces, SpecialCakeEnum type) {
		super(price, name, Description, numOfPeaces);
		this.type = type;
		this.nameOfEvent = type.toString();
	}

}
