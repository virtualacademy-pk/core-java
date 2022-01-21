class Computer
{

	private  Processor processor;
	private String operatingSystem;
	public void setOperatingSystem(String operatingSystem){
		this.operatingSystem = operatingSystem;
	}
	String getOperatingSystem(){
		return this.operatingSystem;
	}
	Computer(){
                 
		 
	}
	 
	Processor getProcessor()
	{
		
			return this.processor;
		
	}
	
	void setProcessor(Processor processor)
	{
			this.processor = processor; 
			this.processor.setClockSpeed(2.5);		
		  
	}
	
    void print(){
	  System.out.println("Operating System"+operatingSystem);
      System.out.println("Clock Speed "+processor.getClockSpeed());
	}	
}

 



	
 