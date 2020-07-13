package collectionproj;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Hary");
		names.add("Meena");
		names.add("Seena");
		names.add("Pru");
		names.add("Nandu");
		
		System.out.println(names.size());
		
		System.out.println(names.contains("Meena"));
		for (String str : names) {
			
			System.out.println(str);
		}

	}

}
