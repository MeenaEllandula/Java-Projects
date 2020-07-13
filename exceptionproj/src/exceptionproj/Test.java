package exceptionproj;

public class Test {

	public static void main(String[] args) {

		try{
	
			SavingsAccount account  = new SavingsAccount(101, 5000);
			
			account = null;
			
			account.withdraw(2000);
			
			System.out.println("Done Withdrawing...");
			
		}catch(Exception e){
			System.out.println("Catch Block");
			
		}
		System.out.println("End of main()");
		
		
		
	}

}
