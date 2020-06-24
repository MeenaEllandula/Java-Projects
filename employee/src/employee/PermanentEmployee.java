package employee;

import java.time.LocalDate;

public class PermanentEmployee extends Employee{
	LocalDate joiningDate;

	public PermanentEmployee(int id, String name, String email, Gender gender, LocalDate dob, String phone, LocalDate joiningDate) {
		super(id, name, email, gender, dob, phone);
		this.joiningDate = joiningDate;
	}

	@Override
	 public void calculateSalary() {
		System.out.println("Contract Employee");
	}
	
	

	
	
}
