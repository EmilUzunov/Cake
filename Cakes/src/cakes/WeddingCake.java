package cakes;

import cakes.abstractAndEnums.WeddingCakesEnum;

public class WeddingCake extends Cake {

	private WeddingCakesEnum size;
	private byte floars;

	public WeddingCake(float price, String name, String Description, byte numOfPeaces, WeddingCakesEnum size) {
		super(price, name, Description, numOfPeaces);
		this.size = size;
		this.floars = (byte)((Math.random()*2)+1);
	}
	
	
	  
	  
	
	public static  Cake generateWeddingBigCake() {
		return new WeddingCake(36.7f, "Mega Cake", "only for Wedding", (byte) 50, WeddingCakesEnum.BIG);

	}

	public static Cake generateWeddingMediumCake() {
		return new WeddingCake(45.3f, "Cool Cake", "only for weddings", (byte) 40, WeddingCakesEnum.MEDIUM);
	}

	public static Cake generateWeddingSmallCake() {
		return new WeddingCake(43.5f, "Cake", "Only for wedding", (byte) 30, WeddingCakesEnum.SMALL);
	}


}
