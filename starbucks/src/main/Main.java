package main;

import java.util.ArrayList;
import java.util.List;

import starbucks.beverages.AbstractBeverage;
import starbucks.beverages.Espresso;
import starbucks.beverages.HomeBrand;
import starbucks.ingredients.Coco;
import starbucks.ingredients.Late;

public class Main {

	private static List<AbstractBeverage> beverages = new ArrayList<AbstractBeverage>();


	public static void main(String args[]) {
		initProducts();
		printMenuCard();
	}


	private static void initProducts() {
		beverages.add(new Coco(new Espresso()));
		// beverages.get(0).setSize(CUPSIZE.BUCKET);
		// beverages.add(new Coco(new Espresso()));
		// beverages.get(1).setSize(CUPSIZE.FISTFUL);
		// beverages.add(new Coco(new Espresso()));
		// beverages.get(2).setSize(CUPSIZE.SPOONFUL);
		beverages.add(new Coco(new Late(new Espresso())));
		beverages.add(new HomeBrand());
		beverages.add(new Late(new HomeBrand()));
	}

	private static void printMenuCard() {
		System.out.println("\t\t\t  - La Carte -");
		for (AbstractBeverage beverage : beverages) {
			System.out.printf("%25s\t-\t%2.2f€\n", beverage.getDescription(), beverage.getPrice());
		}
	}
}
