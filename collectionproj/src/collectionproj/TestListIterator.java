package collectionproj;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Hary");
		names.add("Meena");
		names.add("Seena");
		names.add("Pru");
		names.add("Nandu");
		names.add("Nandu");
		
		ListIterator<String> listIterator = names.listIterator();
		
//		System.out.println(listIterator.hasPrevious());
//		System.out.println(listIterator.previous());
//		
//		listIterator.add("Anil");
//		listIterator.set("Lina");

		System.out.println(names.subList(0, 4));
	}

}
