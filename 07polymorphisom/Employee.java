public abstract class Employee{
 
	protected int employeeId;
	protected String employeeName;
	protected String religion;
	protected float salary;
	protected char employeeType;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public char getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(char employeeType) {
		this.employeeType = employeeType;
	}
   /*public  float calculateSalary(){
		System.out.println("Calculating Base Employee Salary  ");
		return salary;
	}	*/
	 public abstract float calculateSalary();
}