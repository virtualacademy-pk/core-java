
public class ContractualEmployee extends Employee {
	private  int contractDuration;

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}
	
	public  float calculateSalary(){
		System.out.println("Calculating Contractural Employee Salary ");
			return salary;
		}
}
