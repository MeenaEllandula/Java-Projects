package Dish;

import java.util.ArrayList;
import java.util.Collections;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<Item> itemList = new ArrayList<Item>();
	    
		itemList.add(new Item(102,"iphone",500));
		itemList.add(new Item(103,"realme",350));
		itemList.add(new Item(101,"moto",400));
		itemList.add(new Item(104,"iphone",450));

		Collections.sort(itemList);
		
		for (Item item : itemList) {
			System.out.println(item);
		}
	}

}
