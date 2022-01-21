public abstract class Parcel{
	protected int id;
	protected String senderName;
	protected String senderAddress;
	protected String receiverName;
	protected String receiverAddress;
	protected int weight;
	protected int fee;
	protected int feePerGram;
	public Parcel(){
			id = 0;
			senderName = "";
			senderAddress = "";
			receiverName = "";
			receiverAddress = "";
			weight = 0;
			fee = 0;
			feePerGram = 0;
		}
	public void setFeePerGram(int feePerGram){
			this.feePerGram = feePerGram;
		}
	public int getFeePerGram(){
			return this.feePerGram ;
		}
	public void setId(int id){
			this.id = id;
		}
	public int getId(){
			return id;
		}
		
	public void setSenderName(String sname){
			senderName = sname;
		}
	public String getSenderName(){
			return senderName;
		}
		
	public void setSenderAddress(String saddress){
			senderAddress = saddress;
		}
	public String getSenderAddress(){
			return senderAddress;
		}
		
	public void setReceiverName(String rname){
			receiverName = rname;
		}
		
	public String getReceiverName(){
			return receiverName;
		}
		
	public void setReceiverAddress(String raddress){
			receiverAddress = raddress;
		}
		
	public String getReceiverAddress(){
			return receiverAddress;
		}
		
	public void setWeight(int w){
			weight = w;
		}
	
	public int getWeight(){
			return weight;
		}
		
	public void setFee(int f){
			fee = f;
		}
		
	public int getFee(){
		return fee;
		}
	public abstract void printReceipt();
}
 


