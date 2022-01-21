
public class SalariedEmployee extends Employee {
	private float houseRent;

	public float getHouseRent() {
		return houseRent;
	}

	public void setHouseRent(float houseRent) {
		this.houseRent = houseRent;
	}
	public  float calculateSalary(){
		System.out.println("Calculating Salaried Employee Salary ");
		  salary = 	(salary+houseRent);
			
			return salary;
		}

}
