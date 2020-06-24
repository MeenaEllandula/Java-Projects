package employee;

import java.time.LocalDate;

public class ContractEmployee extends Employee{

	LocalDate contractStartDate;
	LocalDate contractEndDate;
	
	public ContractEmployee(int id, String name, String email, Gender gender, LocalDate dob, String phone, LocalDate contractStartDate, LocalDate contractEndDate) {
		super(id, name, email, gender, dob, phone);
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
		
	}
	
	

}
