interface Clickable{
	 double  PI = 9.8;
	 static void staticMethod(){
		
		System.out.println("clicjstatic method");
	}
	default void click(){
		System.out.println("click");
	}
 
	default void print(){
		System.out.println("Clickable");
	}
}
 
interface Accessible{
	final double  PI = 9.89;
	default void access(){
		System.out.println("access");
	}
 
	default void print(){
		System.out.println("Accessible");
	}
	static void staticMethod(){
		System.out.println("accessablestatic method");
	}
}
 
public class Button implements Clickable, Accessible {
 
	public void print(){
	//	Clickable.super.print();
		//Accessible.super.print();
		System.out.println("Implemented Print");
	}
 
	public static void main(String[] args) {
		Button button = new Button();
		//button.click();
		//button.access();
		button.print();
System.out.println("PI " + Accessible.PI);		
Accessible.staticMethod();
Clickable.staticMethod();
	}
}