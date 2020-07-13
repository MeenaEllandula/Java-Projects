package customertask;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Customer customer = new Customer();
		Customer c1 = new Customer(1, "Ram", "hyderabad");
		Customer c2 = new Customer(2, "Aiden", "Etobicoke");
		Customer c3 = new Customer(3, "Sai", "Lakeshore");
		Customer c4 = new Customer(4, "Babu", "Lakeshore");
		Customer c5 = new Customer(5, "Nalini", "Woodbine");
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		
		for (Customer cust : customerList) {
		
			System.out.println(cust.getName());
			
		}
	}

}
