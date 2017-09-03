package cakes;

import java.util.HashSet;
import java.util.Set;

import cakes.abstractAndEnums.AbstractWithNameAndPhone;

public class Dist extends AbstractWithNameAndPhone {

	Set<Order> orders;
	
	public Dist(String name, String phone) {
		super(name, phone);
		orders = new HashSet<Order>();
	}

}
