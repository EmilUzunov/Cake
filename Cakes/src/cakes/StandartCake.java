package cakes;

public class StandartCake extends Cake {
	
	StandartCakesEnum type;
	
	public StandartCake(float price, String name, String Description, byte numOfPeaces, StandartCakesEnum type) {
		super(price, name, Description, numOfPeaces);
		this.type = type;
	}

}
