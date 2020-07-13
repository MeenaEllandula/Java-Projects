package collectionproj;

import java.util.LinkedList;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Hary");
		names.add("Meena");
		names.add("Seena");
		names.add("Pru");
		names.add("Nandu");
		names.add("Nandu");
		
		//System.out.println(names.get(2));
		names.set(2, "Rachel");
		names.add(1, "Raj");
		names.remove(4);
		System.out.println(names.indexOf("Meena"));
		System.out.println(names.lastIndexOf("Nandu"));

		
		for (String str : names) {
			System.out.println(str);
		}
	}

}
