 
public class MainClass{
	public static void main(String arg[]){
		Employee emp = new Employee(5); 
		emp.setEmployeeId(1);
		emp.setEmployeeName("Ali Imran");
		System.out.println("Employee Id " + emp.getEmployeeId() );
		System.out.println("Employee is " + emp.getEmployeeName() );
		System.out.println("Religion " + emp.getReligion() );
 
		}
}