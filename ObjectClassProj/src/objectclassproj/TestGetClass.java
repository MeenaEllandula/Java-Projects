package objectclassproj;

import java.lang.reflect.Method;

import com.Item;

public class TestGetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item1 = new Item(101,"IPhone",500);
		
		Class class1 = item1.getClass();
		
		System.out.println("Name :"+class1.getName());
		
		 Method[] methodArr = class1.getMethods();
		
		System.out.println("\nMethods list");
		
		for (Method method : methodArr) {
			System.out.println(method.getName());
			
		}
		
	}

}
