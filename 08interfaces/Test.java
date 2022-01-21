
interface Toolbar{
	void save();
 }
   
 class Employee  implements Toolbar{
  	public void save(){
 	System.out.println("Employee Saved ");
	}
  
}

 class Department implements Toolbar {
  	public void save(){
 	System.out.println("Department Saved");
	}
	 
}
public class Test {
	public static void main(String[] args) {
		Toolbar bar = new Employee();
		bar.save();
		bar = new Department();
	    bar.save();
	}
}