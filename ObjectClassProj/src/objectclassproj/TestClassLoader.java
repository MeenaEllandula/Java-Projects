package objectclassproj;

import com.Item;

public class TestClassLoader {
	
	public static Object createObject(String className) {
		try {
			Class class1 = Class.forName(className);
			return class1.newInstance();

			
		
		} catch (Exception e) {
    
			e.printStackTrace();
		}
		
		return null;
		
		
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		
		
		Item item = (Item)createObject("com.Item");
		 
		System.out.println(item);
		
		String str = (String)createObject("java.lang.String");
			

		
		}

}
