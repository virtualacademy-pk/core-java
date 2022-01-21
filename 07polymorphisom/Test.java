
public class Test {
	 static void printSalaries(Employee _emp[], int size) {
			for (int i = 0; i < size; i++) {
				System.out.println("---------------------------------------");
				System.out.println("Employee Type is  : "+_emp[i].getEmployeeType());
				System.out.println("Employee Id :"+_emp[i].getEmployeeId());
				System.out.println("Employee Name :"+_emp[i].getEmployeeName());
				float salary = _emp[i].calculateSalary();	
				System.out.println("Employee Salary :"+salary);
				System.out.println("---------------------------------------");
			}
		}
	public static void main(String[] args) {
		Employee _emp[] = new Employee[3];
		SalariedEmployee e1 = new SalariedEmployee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("Sohail");
		e1.setHouseRent(500.0f);
		e1.setSalary(1000.0f);		 
		e1.setEmployeeType('S');
		_emp[0] = e1;
		 ContractualEmployee e2 = new ContractualEmployee();
		e2.setEmployeeId(1);
		e2.setEmployeeName("Ali");
 		e2.setContractDuration(3);
 		e2.setEmployeeType('C');
 		e2.setSalary(5400.00f);
		 _emp[1] = e2;
		 HourlyEmployee e3 = new HourlyEmployee();
 		e3.setEmployeeId(3);
		e3.setEmployeeName("Aslam");
		e3.setHourlyRate(200);
	 	e3.setHourWorked(40);
	 	e3.setEmployeeType('H');
	 	_emp[2] = e3;
	 	printSalaries(_emp,3);
	}

}
