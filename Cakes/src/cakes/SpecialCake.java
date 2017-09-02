package cakes;

public class SpecialCake extends Cake {

	private SpecialCakeEnum type;
	private String nameOfEvent;

	public SpecialCake(float price, String name, String Description, byte numOfPeaces, SpecialCakeEnum type) {
		super(price, name, Description, numOfPeaces);
		this.type = type;
		this.nameOfEvent = type.toString();
	}
	
	public static Cake generateSpecialComercialCake() {
		return new SpecialCake(32.50f, "Special Cake1", "It is special", (byte) 10, SpecialCakeEnum.COMERCIAL);

	}

	public static Cake generateSpecialFirmCake() {
		return new SpecialCake(32.50f, "Special Cake2", "Something", (byte) 11, SpecialCakeEnum.FIRM);
	}

	public static Cake generateSpecialUbilaiCake() {
		return new SpecialCake(32.50f, "Special Cake3", "Delicios", (byte) 12, SpecialCakeEnum.UBILEI);
	}
	
	
	  
	  

}
