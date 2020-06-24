package Dish;

import java.util.ArrayList;
import java.util.Collections;

public class TestDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Dish> dishList = new ArrayList<Dish>();
		
		dishList.add(new Dish("Pork Fry",false,800,DishType.Meat));
		dishList.add(new Dish("Pepper Chicken",false,700,DishType.Meat));
		dishList.add(new Dish("BBQ Ribs",false,600,DishType.Meat));
		dishList.add(new Dish("French Fries",true,500,DishType.OTHER));
		dishList.add(new Dish("Double Cheese Pizza",true,400,DishType.OTHER));
		dishList.add(new Dish("Season Fruit",true,120,DishType.OTHER));
		dishList.add(new Dish("Salmon",false,500,DishType.FISH));
		dishList.add(new Dish("Prawns",false,300,DishType.FISH));
		dishList.add(new Dish("Rice Pudding",true,200,DishType.OTHER));
		dishList.add(new Dish("Milk Shake",true,150,DishType.OTHER));
		
		Collections.sort(dishList);
		
		for (Dish dish : dishList) {
			System.out.println(dish);
		}
	}

}
