import java.util.Scanner;
public class CargoSystem {



public static void main(String args[]) {
	 Scanner cIn = new Scanner(System.in);
	int receiptnum, weight, charges,serviceType,overFee;
	String sname, saddress, rname, raddress; 
	 
	 while(true){
	 	System.out.println("Enter 1 for normal and 2 for urgent service.");
		serviceType = Integer.parseInt(cIn.nextLine());
	 		System.out.println("Selected Type of Serice  : "+serviceType);
		if(serviceType == 1 || serviceType == 2){
			break;
		}else{
			System.out.println("Selected Type Of Service is Incorrect");
		}	 
	 		
			
}	
	
	
	System.out.print("Enter receipt no.: ");
	receiptnum = Integer.parseInt(cIn.nextLine());
	
	
	System.out.print("Enter sender name: ");
	 sname = cIn.nextLine();
	
	System.out.print("Enter sender address: ");
	saddress = cIn.nextLine();
	
	System.out.print("Enter receiver name: ");
	rname = cIn.nextLine();
	
	System.out.print("Enter receiver address: ");
	raddress = cIn.nextLine();
	
	System.out.print("Enter weight(in grams)) of parcel: ");
	weight = Integer.parseInt(cIn.nextLine());
	
	System.out.print("Basic Charges of Parcel: ");
	charges = Integer.parseInt(cIn.nextLine());  

	System.out.print("Fee per Gram (Overweight): ");
	overFee = Integer.parseInt(cIn.nextLine()); 
	int additionalFee = 0;
	if(serviceType == 2 ){
		System.out.print("Enter Additional Fee Per Gram : ");
		additionalFee = Integer.parseInt(cIn.nextLine()); 
			Parcel p = new UrgentParcel();
	p.setId(receiptnum);
	p.setAdditionalFeePerGram(additionalFee);
	p.setSenderName(sname);
	p.setSenderAddress(saddress);
	p.setReceiverName(rname);
	p.setReceiverAddress(raddress);
	p.setWeight(weight);
	p.setFee(charges);
	p.setFeePerGram(overFee);
	p.printReceipt();

	}else{
		Parcel p =new NormalParcel();
	p.setId(receiptnum);
	 
	p.setSenderName(sname);
	p.setSenderAddress(saddress);
	p.setReceiverName(rname);
	p.setReceiverAddress(raddress);
	p.setWeight(weight);
	p.setFee(charges);
	p.setFeePerGram(overFee);
	p.printReceipt();

	}	
	
	
 
}
}
