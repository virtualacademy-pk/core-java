     public class Parcel
    {
        private int id;
        private String senderName;
        private String senderAddress;
        private String receiverName;
        private String receiverAddress;
        private int weight;
        private int fee;

	void setId(int id){
			this.id = id;
		}
		int getId(){
			return id;
		}
		
		void setSenderName(String sname){
			this.senderName = sname;
		}
		String getSenderName(){
			return senderName;
		}
		
		void setSenderAddress(String saddress){
			this.senderAddress = saddress;
		}
		String getSenderAddress(){
			return senderAddress;
		}
		
		void setReceiverName(String rname){
			this.receiverName = rname;
		}
		String getReceiverName(){
			return receiverName;
		}
		
		void setReceiverAddress(String raddress){
			this.receiverAddress = raddress;
		}
		String getReceiverAddress(){
			return receiverAddress;
		}
		
		void setWeight(int w){
			this.weight = w;
		}
		int getWeight(){
			return weight;
		}
		
		void setFee(int f){
			this.fee = f;
		}
		int getFee(){
			return fee;
		}

    }
  