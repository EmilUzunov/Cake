package cakes;

public class StandartCake extends Cake {
	
	private StandartCakesEnum type;
	private boolean isSiroped = false;
	
	public StandartCake(float price, String name, String Description, byte numOfPeaces, StandartCakesEnum type) {
		super(price, name, Description, numOfPeaces);
		this.type = type;
		if(Math.random()<0.49){
			isSiroped = true;
		}
	}

}
