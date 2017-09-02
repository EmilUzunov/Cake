package cakes;

import java.util.Arrays;

public class StandartCake extends Cake {

	private StandartCakesEnum type;
	private boolean isSiroped = false;

	public StandartCake(float price, String name, String Description, byte numOfPeaces, StandartCakesEnum type) {
		super(price, name, Description, numOfPeaces);
		this.type = type;
		if (Math.random() < 0.49) {
			isSiroped = true;
		}
	}

	public static  Cake generateStandartBisquidCake() {
		return new StandartCake(12.50f, "StSm", "This is the small one.", (byte) 6, StandartCakesEnum.BISQUID);

	}

	public static Cake generateStandartChocolateCake() {
		return new StandartCake(15.20f, "Chocolate", "The chocolate one", (byte) 8, StandartCakesEnum.CHOCOLATE);
	}

	public static Cake generateStandartFruitCake() {
		return new StandartCake(15.20f, "Fruit", "The fruit one", (byte) 8, StandartCakesEnum.FRUIT);
	}

	public static Cake generateStandartEclerCake() {
		return new StandartCake(12.30f, "StPDDm", "This is the small one.", (byte) 6, StandartCakesEnum.ECLER);
	}

}
