package oopproj;

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
	public void withdraw(int withdrawlAmount) {
		if(withdrawlAmount <= balance) {
			this.balance = this.balance - withdrawlAmount;
		}
		else {
			System.out.println("You have insufficiant funds");
		}
	}
	//withdraw(int,int)
	public void withdraw(int pin, int withdrawlAmount) {
		if(this.pin == pin) {
			if(withdrawlAmount <= 4000) {
				withdraw(withdrawlAmount);
			}else {
				System.out.println("Withdrawl limit exceeded...");
			}
		}else {
				System.out.println("Invalid pin...");
			}
			
		}
	}

