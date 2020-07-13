package objectclassproj;

import com.Item;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item1 = new Item(101,"IPhone",500);
		Item item2 = new Item(101,"IPhone",500);
		
		System.out.println(item1.equals(item2));
		
		String s1 = new String("Good Morning");
		String s2 = new String("Good Morning");
		
		System.out.println(s1.equals(s2));
		
	}

}
