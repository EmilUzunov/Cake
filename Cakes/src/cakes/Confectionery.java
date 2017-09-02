package cakes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

public class Confectionery extends AbstractWithNameAndPhone {
	private String adress;
	private Set<Cake> cakesInMenu;
	private Map<String,TreeSet<Cake>> cakesInStock;

	public Confectionery(String name, String phone) {
		super(name, phone);
		cakesInMenu = new HashSet<Cake>();
		cakesInMenu.addAll(Arrays.asList(StandartCake.generateStandartBisquidCake(),
										 StandartCake.generateStandartChocolateCake(),
										 StandartCake.generateStandartEclerCake(),
										 StandartCake.generateStandartFruitCake(),
										 WeddingCake.generateWeddingBigCake(),
										 WeddingCake.generateWeddingMediumCake(),
										 WeddingCake.generateWeddingSmallCake(),
										 SpecialCake.generateSpecialComercialCake(),
										 SpecialCake.generateSpecialFirmCake(),
										 SpecialCake.generateSpecialUbilaiCake(),
										 ChildCake.generateChildBirthdayCake(),
										 ChildCake.generateChildKrushteneFirmCake(),
										 ChildCake.generateChildProshtapulnikCake()));

		
		cakesInStock = new TreeMap<String, TreeSet<Cake>>();
		cakesInStock.put("Standart", new TreeSet<Cake>());
		cakesInStock.put("Wedding", new TreeSet<Cake>());
		cakesInStock.put("Special", new TreeSet<Cake>());
		cakesInStock.put("Child", new TreeSet<Cake>());
	}
	public void printMenu(){
		for(Cake cake: this.cakesInMenu){
		System.out.println(cake);
		}
	}

}
