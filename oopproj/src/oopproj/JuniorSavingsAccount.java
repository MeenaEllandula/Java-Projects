package oopproj;

public class JuniorSavingsAccount extends SavingsAccount{

	String guardianName;

	public JuniorSavingsAccount(int accountNo, float balance, int pin, String guardianName) {
		super(accountNo, balance, pin);
		this.guardianName = guardianName;
	}
	
	public void getDetails() {
		System.out.println("AccountNo : "+accountNo); 
		System.out.println("Balance :"+getBalance());
		System.out.println("Guardian Name :"+guardianName);


	}
	@Override
	public void withdraw(int pin, int withdrawlAmount) {
		if(this.pin == pin) {
			if(withdrawlAmount <= 1000) {
				withdraw(withdrawlAmount);
			}else {
				System.out.println("Withdrawl limit exceeded...");
			}
		}else {
				System.out.println("Invalid pin...");
			}
			
		}
	
	
}
