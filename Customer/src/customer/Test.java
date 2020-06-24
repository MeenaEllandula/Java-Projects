package customer;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer customer = new Customer();
		
		customer.setCustomerID(1);
		customer.setFirstName("Hary");
		customer.setLastName("John");
		customer.setPhone("23456");
		customer.setEmail("hary.john@gmail.com");
		customer.setDob(LocalDate.of(1996, 02, 11));
		customer.setGender(Gender.OTHER);
		
		System.out.println("CustomerID : "+customer.getCustomerID());
		System.out.println("First Name : "+customer.getFirstName());
		System.out.println("Last Name : "+customer.getLastName());
		System.out.println("PhoneNo : "+customer.getPhone());
		System.out.println("Email : "+customer.getEmail());
		System.out.println("Date of Birth : "+customer.getDob());
		System.out.println("Gender : "+customer.gender);
		
	} 

}
