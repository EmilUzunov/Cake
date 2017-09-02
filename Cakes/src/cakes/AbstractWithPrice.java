package cakes;

public abstract class AbstractWithPrice {
	float price;

	public AbstractWithPrice(float price) {
		if (price > 0) {
			try{
			this.price = price;
			}catch(NullPointerException e){
				System.out.println("You will have to provide the price!");
			}
		}
	}

}
