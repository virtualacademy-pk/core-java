
public   class HourlyEmployee extends Employee{
	protected float  hourlyRate;
    protected float hourWorked;
	
  public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public float getHourWorked() {
		return hourWorked;
	}

	public void setHourWorked(float hourWorked) {
		this.hourWorked = hourWorked;
	}

public  float calculateSalary(){
	  salary = hourlyRate * hourWorked;
		System.out.println("Calculating Hourly Employee Salary  ");
		return salary;
	}
}