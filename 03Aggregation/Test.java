 public class Test{	
public static void  main(String arg[]){
     	 Processor processor = new Processor(3.6);
		 {
         Computer pc1 = new Computer();
         pc1.setProcessor(processor);
         pc1.print();
		}

     System.out.println("Clock Speed "+processor.getClockSpeed());
          
     }	
	
}

