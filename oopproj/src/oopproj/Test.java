package oopproj;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount account = new SavingsAccount(101,5000,1234);
		
		
		
		System.out.println("AccoountNo : "+account.accountNo);
		System.out.println("Balance    : "+account.getBalance());
		System.out.println("Pin        : "+account.pin);
		
        SavingsAccount account2 = new SavingsAccount(102,6000,2345);
		
		
		
		System.out.println("AccoountNo : "+account2.accountNo);
		System.out.println("Balance    : "+account2.getBalance());
		System.out.println("Pin        : "+account2.pin);
	}

}
