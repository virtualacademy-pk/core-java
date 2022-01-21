import java.util.Scanner;
public class CargoSystemNoOOP{
 	public static void main(String args[]){
	 Scanner cIn = new Scanner(System.in);
	int receiptnum, weight, charges;
	String  sname, saddress, rname, raddress; 
	
	System.out.print("Enter receipt no.: ");
	String rcpt = cIn.nextLine();
	receiptnum = Integer.parseInt(rcpt);
	
	System.out.print("Enter sender name: ");
	sname = cIn.nextLine();//cin>>sname;
	
	System.out.print("Enter sender address: ");
	 
	saddress = cIn.nextLine();//cin>>saddress;
	
	System.out.print("Enter receiver name: ");
	rname = cIn.nextLine();//cin>>rname
	
	System.out.print("Enter receiver address: ");
	raddress = cIn.nextLine();//cin>>raddress;
	
	System.out.print("Enter weight(in grams)) of parcel: ");
	weight = Integer.parseInt(cIn.nextLine());
	
	System.out.print("Enter shipment charges: ");
	charges = Integer.parseInt(cIn.nextLine());
	
	System.out.println("\n\nShipment Receipt");
	System.out.println("-------------------------");
	System.out.println("Receipt No. : "+receiptnum);
	System.out.println("Sender Name : "+sname);
	System.out.println("Sender Address : "+saddress);
	System.out.println("Receiver Name : "+rname);
	System.out.println("Receiver Address : "+raddress);
	System.out.println("Parcel Weight : "+weight+" grams");
	System.out.println("Parcel Shiping Charges : "+charges); 
 }
}