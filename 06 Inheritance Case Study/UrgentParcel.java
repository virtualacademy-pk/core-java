
public class UrgentParcel extends Parcel{
	protected int additionalFeePerGram;
	public int getAdditionalFeePerGram(){
		return this.additionalFeePerGram;
		
	}
	public void setAdditionalFeePerGram(int additionalFeePerGram){
		this.additionalFeePerGram = additionalFeePerGram;
	} 
	public void printReceipt(){
		int overWeightCharges = 0;
		float totalCharges = 0;
		int totalOverWeight = 0;
		float basicCharges = this.fee;
		basicCharges =  (basicCharges + (basicCharges * 0.5f));
		totalCharges =  basicCharges ;
		
		if(this.weight>900 ){
		
			totalOverWeight = this.weight - 900 ;
			int appliedRate =  (this.feePerGram  + this.additionalFeePerGram);
			
			overWeightCharges =  totalOverWeight * appliedRate;
			totalCharges =  (basicCharges + ( appliedRate * totalOverWeight ));
		}
		System.out.println("\n\nShipment Receipt");
		System.out.println("-------------------------");
		System.out.println("Receipt No. : "+this.id);
		System.out.println("Sender Name : "+this.senderName);
		System.out.println("Sender Address : "+this.senderAddress);
		System.out.println("Receiver Name : "+this.receiverName);
		System.out.println("Receiver Address : "+this.receiverAddress);
		System.out.println("Parcel Weight : "+this.weight);
		if(totalOverWeight>0){
			System.out.println("OverWeight : "+totalOverWeight+"g");
		}else{
			System.out.println("OverWeight : No");
		}
		
		System.out.println("Basic Charges : "+basicCharges);
		System.out.println("OverWeight Charges: "+overWeightCharges);
		System.out.println("Shipment Total Charges: "+totalCharges);
		System.out.println("Type of Shipment: Urgent");
		 
	}
}