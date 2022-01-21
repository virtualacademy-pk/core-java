class NormalParcel extends Parcel {
	public void printReceipt(){
		int overWeightCharges = 0;
 		int totalOverWeight = 0;
		int totalCharges = this.fee;
		if(this.weight>900 ){
			totalOverWeight = this.weight - 900 ;
			overWeightCharges =  totalOverWeight * this.feePerGram ;
			totalCharges =  totalCharges + (this.feePerGram * totalOverWeight );
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
		System.out.println("Basic Charges : "+this.fee);
		System.out.println("OverWeight Charges: "+overWeightCharges);
		System.out.println("Shipment Total Charges: "+totalCharges);
		System.out.println("Type of Shipment: Normal");
	}
}
 
