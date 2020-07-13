package collectionproj;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Hary");
		names.add("Meena");
		names.add("Seena");
		names.add("Pru");
		names.add("Nandu");
		
		Iterator<String> iterator = names.iterator();
		
		iterator.next();
		iterator.remove();
		
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			
		}
	}

}
