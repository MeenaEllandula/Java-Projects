package memorymgmt;

public class TestRuntime {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		
		runtime.gc();
		
		System.out.println("Total memory"+runtime.totalMemory());
		
		System.out.println("Free memory before creating objects: "+runtime.freeMemory());
		
		for (int i = 0; i < 40000;) {
			
			new SavingsAccount(++i, 5000);
		}
		
		System.out.println("Free memory after creating objects: "+runtime.freeMemory());
		
		System.out.println("Calling GC...");
		
		System.gc();
		
		System.out.println("Free memory after calling GC: "+runtime.freeMemory());

		
	}

}
