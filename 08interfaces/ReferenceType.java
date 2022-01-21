 class Button implements Clickable {
	public void click(){
		System.out.println("Button Clicked");
	}
  public void doubleClick(){
	System.out.println("Button Double Clicked");
  }
}
public class ReferenceType 
public static void main(String arg[]){
		Clickable b = new Button();
		b.click();
		b = new CheckBox();
		b.click();
}	 
}