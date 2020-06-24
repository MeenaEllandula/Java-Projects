package bankapp;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAppDB bankAppDB = new BankAppDB();

		SavingsAccount[] accountArr = bankAppDB.accountList;
		
		SavingsAccount account =    bankAppDB.findByAccountNo(3);
		
		account.printDetails();
//		for (int i = 0; i < accountArr.length; i++) {
//			SavingsAccount account = accountArr[i];
//			
//			System.out.print("AccountNO:"+account.accountNo);
//			System.out.println(" Balance:"+account.getBalance());
//		}
	}

}
