package cakes;

public class ChildCake extends Cake {

	private ChildCakeEnum event;
	private String nameOfTheChild;
	
	public ChildCake(float price, String name, String Description, byte numOfPeaces, ChildCakeEnum event, String nameOfTheChild) {
		super(price, name, Description, numOfPeaces);
		this.event = event;
		this.nameOfTheChild = nameOfTheChild;
		
	}
	
}
