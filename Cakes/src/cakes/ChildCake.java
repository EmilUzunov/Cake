package cakes;

public class ChildCake extends Cake {

	private ChildCakeEnum event;
	private String nameOfTheChild;
	
	public ChildCake(float price, String name, String Description, byte numOfPeaces, ChildCakeEnum event, String nameOfTheChild) {
		super(price, name, Description, numOfPeaces);
		this.event = event;
		this.nameOfTheChild = nameOfTheChild;
		
	}
	
	public static  Cake generateChildBirthdayCake() {
		return new ChildCake(10.50f, "Funny one", "It is good!", (byte) 6, ChildCakeEnum.BIRTHDAY, "Tim");

	}

	public static Cake generateChildKrushteneFirmCake() {
		return new ChildCake(11.50f, "Take me", "You will like it!", (byte) 8, ChildCakeEnum.KRUSHTENE,"Sara");
	}

	public static Cake generateChildProshtapulnikCake() {
		return new ChildCake(12.50f, "Big one", "For two.", (byte) 10, ChildCakeEnum.PROSHTAPULNIK,"Stiv");
	}
	
	  
	  
	  
	
}
