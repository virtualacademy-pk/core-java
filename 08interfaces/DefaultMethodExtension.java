interface MouseInterface{
	default void doubleClick(){
		System.out.println("MouseInterface Double Click");
	}
}
interface Clickable extends MouseInterface{
  	 void click();
	 default void doubleClick(){
		System.out.println("Clickable Double Click");
	}
	 
}
  
class CheckBox implements Clickable{
	@Override
	public void click(){
		System.out.println("Checkbox click");
	}
	 
	 
	
} 
class Button implements Clickable{
	@Override
	public void click(){
		System.out.println("Button click");
	}
	@Override
	 public void doubleClick(){
	 	System.out.println("Button Double click");
	 } 
}
public class DefaultMethodExtension{  
	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		 button.doubleClick();
		 CheckBox cb = new CheckBox();
		 
		 cb.click();
		 cb.doubleClick();
	}
}