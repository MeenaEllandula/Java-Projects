package bankapp;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to ATM service");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter AccouontNo : ");
		int accountNo = scanner.nextInt();
		
		BankAppDB bankAppDB = new BankAppDB();
		 
		SavingsAccount account = bankAppDB.findByAccountNo(accountNo);
		System.out.println("Enter Pin : ");
		int pin = scanner.nextInt();
		
		if(account!=null && account.isPinValid()) {
			
			System.out.println("Select transaction type : \n 1.Balance Enquiry \n 2.Withdrawl");
			int value = scanner.nextInt();
			switch (value) {
			
			case 1:
				System.out.println("Balance : "+account.getBalance());
				break;
				
			case 2:
				System.out.println("Enter withdrawl amount : ");
				int withdrawlAmount = scanner.nextInt();
				boolean result = account.withdraw(pin,withdrawlAmount);
				
				if(result) {
					System.out.println("Please collect the cash");
				}
				break;
				
			default:
				System.out.println("Invalid selection value");
				break;
			}
			
		}
		else {
			System.out.println("Account does not exist!!!");
		}
	}

}
