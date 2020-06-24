package bankapp;

public class BankAppDB {

	SavingsAccount accountList[] = new SavingsAccount[5];
	
	public BankAppDB() {

	for (int i = 0; i < accountList.length; ) {
		accountList[i] = new SavingsAccount(++i, 5000, 1234);
	}
	}
	public SavingsAccount[] getAccountList() {
		return accountList;
	}
	
	public  SavingsAccount findByAccountNo(int accountNo) {
		for (SavingsAccount savingsAccount : accountList) {
			if(savingsAccount.accountNo == accountNo) {
					return savingsAccount;
			}
		}
		return null;
	}
	
}
