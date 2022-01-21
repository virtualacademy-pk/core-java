public class Employee{
 
	private int employeeId;
	private String employeeName;
	private String religion;
	public Employee(){
	   	System.out.println("Calling Default Constructor");
   		employeeId = 0;
   		employeeName = "";
   		religion = "Islam";
	   }
	   public Employee(int employeeId){
	   	System.out.println("Calling param constructor with Id");
   		this.employeeId = employeeId;
   		employeeName = "";
   		religion = "Islam";
	   } 
	public void setEmployeeId(int employeeId){
		this.employeeId = employeeId;
	}
	public int getEmployeeId(){
		return this.employeeId;
	}
	public void setEmployeeName(String employeeName){
	 	this.employeeName = employeeName;
	 }
	 public String getEmployeeName(){
	 	return this.employeeName;
	 }
	 void setReligion(String religion){
	   this.religion = religion;
	   
	   
	   }
	String getReligion(){
		return this.religion;
	}
}