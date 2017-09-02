package cakes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Confectionery extends AbstractWithNameAndPhone {
	private String adress;
	private Set<Cake> cakesInStock;

	public Confectionery(String name, String phone) {
		super(name, phone);
		cakesInStock = new HashSet<Cake>();
		cakesInStock.addAll(Arrays.asList(new StandartCake(12.50f, "StSm", "This is the small one.", (byte)6, StandartCakesEnum.BISQUID),
										  new StandartCake(15.20f,"Chocolate","The chocolate one",(byte)8,StandartCakesEnum.CHOCOLATE),
										  new StandartCake(15.20f,"Fruit","The fruit one",(byte)8,StandartCakesEnum.FRUIT),
										  new StandartCake(12.30f, "StSm", "This is the small one.",(byte) 6, StandartCakesEnum.ECLER),
										  new WeddingCake(30.7f, "Mega Cake", "only for Wedding", (byte) 50, WeddingCakesEnum.BIG),
										  new WeddingCake(25.3f, "Cool Cake", "only for weddings", (byte) 40, WeddingCakesEnum.MEDIUM),
										  new WeddingCake(23.5f, "Cake", "Only for wedding", (byte) 30, WeddingCakesEnum.SMALL),
										  new SpecialCake(32.50f, "Special Cake1", "It is special", (byte)10, SpecialCakeEnum.COMERCIAL),
										  new SpecialCake(32.50f, "Special Cake2", "Something", (byte)11, SpecialCakeEnum.FIRM),
										  new SpecialCake(32.50f, "Special Cake3", "Delicios", (byte)12, SpecialCakeEnum.UBILEI),
										  new ChildCake(10.50f, "Funny one", "It is good!", (byte) 6, ChildCakeEnum.BIRTHDAY, "Tim"),
										  new ChildCake(11.50f, "Take me", "You will like it!", (byte) 8, ChildCakeEnum.BIRTHDAY,"Sara"),
										  new ChildCake(12.50f, "Big one", "For two.", (byte) 10, ChildCakeEnum.BIRTHDAY,"Stiv")));

	}
	public void printMenu(){
		for(Cake cake: this.cakesInStock){
		System.out.println(cake);
		}
	}

}
