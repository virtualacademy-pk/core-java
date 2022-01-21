 
public class MainClass{
	public static void main(String arg[]){
		Employee emp = new Employee(); 
		Employee.setCompanyName("Virtual University of Pakistan");
		emp.setEmployeeId(1);
		//emp.setCompanyName("Virtual University");
		emp.setEmployeeName("Ali Imran");
 		
		 
		Employee emp2 = new Employee(); 
		//emp2.setCompanyName("VU");
		emp2.setEmployeeId(2);
		emp2.setEmployeeName("Aamir");
 		System.out.println("Employee Id " + emp.getEmployeeId() );
		System.out.println("Company Name " + emp.getCompanyName() );
		System.out.println("----------------------");
		System.out.println("Employee Id " + emp2.getEmployeeId() );
		System.out.println("Company Name " + emp2.getCompanyName() );
		}
}