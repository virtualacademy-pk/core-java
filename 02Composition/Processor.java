
public class Processor
{
    private    double clockSpeed;
    private ArithmaticAndLogicUnit alu;
    private ControllUnit controllUnit;
    private MemoryUnit memoryUnit;
    public	Processor(){
    	clockSpeed =2.5;
    	alu = new ArithmaticAndLogicUnit();
    	controllUnit = new ControllUnit();
    	memoryUnit = new MemoryUnit();
   }	
    public Processor(double cs){
    	       clockSpeed=cs;
    	       alu = new ArithmaticAndLogicUnit();
    	       controllUnit = new ControllUnit();
    	       memoryUnit = new MemoryUnit();
    }
        
   double getClockSpeed(){
   		return clockSpeed;
   }
   
   void setClockSpeed(double cs){
   		clockSpeed=cs;
   }
	void printSpec(){
 		System.out.println("ArithmaticAndLogicUnit");
	 }
}