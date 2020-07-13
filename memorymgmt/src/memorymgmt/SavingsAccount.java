 package memorymgmt;

public class SavingsAccount {
	
	int accountNo;
	private float balance;
	int pin;
	final static int minnimumBalance = 500;
	
	
	
	public SavingsAccount(int accountNo, float balance, int pin) {
	
		this.accountNo = accountNo;
		this.balance = balance;
		this.pin = pin;
	}
	
	
	public SavingsAccount(int accountNo, float balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}


	public boolean isPinValid() {
		if(this.pin == pin) {
			return true;	
		}
		return false;
	}
	public float getBalance() {
		return balance;
	}
    public void deposit( int amount) {
		System.out.println();
		if(amount > 0) {
			balance = balance + amount;
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
    //withdraw(int)
	public boolean withdraw(int withdrawlAmount) {
		if(withdrawlAmount <= balance) {
			this.balance = this.balance - withdrawlAmount;
			return true;
		}
		else {
			System.out.println("You have insufficiant funds");
		}
		return false;
	}
	//withdraw(int,int)
	public boolean withdraw(int pin, int withdrawlAmount) {
		if(this.pin == pin) {
			if(withdrawlAmount <= 4000) {
				withdraw(withdrawlAmount);
				return true;
			}else {
				System.out.println("Withdrawl limit exceeded...");
			}
		}else {
				System.out.println("Invalid pin...");
			}
		return false;
			
		}
	public void printDetails() {
		System.out.println("AccountNo: "+accountNo+" Balance : "+balance);
		
	}
	
	}

