package memorymgmt;

public class Test {

	public static void main(String[] args) {

		int i = 100;
		
		SavingsAccount account = new SavingsAccount(101,5000);
		
		account = null;
		
		account.withdraw(1000);
		
		System.gc();
		
		System.out.println("End of main()");
		
	}

}
