
public class HourlyEmployee extends Employee{
	 public HourlyEmployee(int employeeId){
	 super(employeeId);
	   	System.out.println("Calling param constructor with Id");
   		 
	   } 
	protected int hourlyRate;
    protected int hourWorked;
	public void setHourlyRate(int hourlyRate){
	  	this.hourlyRate = hourlyRate;
	  }  
	public int getHourlyRate(){
	  	return this.hourlyRate;
	  }
}