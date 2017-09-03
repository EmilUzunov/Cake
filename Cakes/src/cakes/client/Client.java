package cakes.client;

import java.util.LinkedList;
import java.util.List;

import cakes.Cake;
import cakes.ChildCake;
import cakes.Order;
import cakes.SpecialCake;
import cakes.StandartCake;
import cakes.WeddingCake;
import cakes.abstractAndEnums.AbstractWithNameAndPhone;

public abstract class Client extends AbstractWithNameAndPhone {

	public Client(String name, String phone) {
		super(name, phone);
	}

	public abstract  Order orderCakes(String address);

}
