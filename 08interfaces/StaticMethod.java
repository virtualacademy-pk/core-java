interface Clickable {
  	 static void move(){
		System.out.println("Mouse Move");
	 } 
	 
}
   
class Button implements Clickable{
	 @Override
	 public static void move(){
		System.out.println("Mouse Move");
	 } 
}
public class StaticMethod{  
	public static void main(String[] args) {
		Button button = new Button();
		Clickable.move();
	}
}	