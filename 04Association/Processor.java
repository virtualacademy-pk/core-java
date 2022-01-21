 
public class Processor
{
    private double clockSpeed;
    
    public Processor(){
    	clockSpeed =2.5;
    	}	
    	
    public Processor(double cs){
    	       clockSpeed=cs;
        }
        
   public double getClockSpeed(){
   		return clockSpeed;
   }
   
   public void setClockSpeed(double cs){
   		clockSpeed=cs;
   }
	
}

