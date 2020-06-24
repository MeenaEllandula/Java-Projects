package employee;

import java.time.LocalDate;

public abstract class Employee {
	int id;
	String name;
	String email;
	Gender gender;
    LocalDate dob;
    String phone;
    
    	public Employee() {
		// TODO Auto-generated constructor stub
	} 
    
	public Employee(int id, String name, String email, Gender gender, LocalDate dob, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
	}
    
	abstract public void calculateSalary();		
    
}
