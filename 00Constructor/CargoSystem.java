import java.util.Scanner;
public class CargoSystem{
 	public static void main(String args[]){
	 Scanner cIn = new Scanner(System.in);
	int receiptnum, weight, charges;
	String  sname, saddress, rname, raddress; 
	
	System.out.print("Enter receipt no.: ");
	receiptnum = Integer.parseInt(cIn.nextLine());
	 
	System.out.print("Enter sender name: ");
	sname = cIn.nextLine();
	
	System.out.print("Enter sender address: ");
	 
	saddress = cIn.nextLine();
	
	System.out.print("Enter receiver name: ");
	rname = cIn.nextLine();;
	
	System.out.print("Enter receiver address: ");
	raddress = cIn.nextLine();
	
	System.out.print("Enter weight(in grams)) of parcel: ");
	weight = Integer.parseInt(cIn.nextLine());
	
	System.out.print("Enter shipment charges: ");
	charges = Integer.parseInt(cIn.nextLine());
	Parcel p = new Parcel();
	p.setId(receiptnum);
	p.setSenderName(sname);
	p.setSenderAddress(saddress);
	p.setReceiverName(rname);
	p.setReceiverAddress(raddress);
	p.setWeight(weight);
	p.setFee(charges);
	 
	displayReceipt(p);
	
 }
 static void displayReceipt(Parcel p){
 	System.out.println("\n\nShipment Receipt");
	System.out.println("-------------------------");
	System.out.println("Receipt No. : "+p.getId());
	System.out.println("Sender Name : "+p.getSenderName());
	System.out.println("Sender Address : "+p.getSenderAddress());
	System.out.println("Receiver Name : "+p.getReceiverName());
	System.out.println("Receiver Address : "+p.getReceiverAddress());
	System.out.println("Parcel Weight : "+p.getWeight()+" grams");
	System.out.println("Parcel Shiping Charges : "+p.getFee());
 }
}