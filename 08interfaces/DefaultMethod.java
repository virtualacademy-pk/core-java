interface Clickable{
  	 void click();
	default void doubleClick(){
		System.out.println("Default Double Click");
	}
	 
}
  
class CheckBox implements Clickable{
	@Override
	public void click(){
		System.out.println("Checkbox click");
	}
	@Override
	public void doubleClick(){
		System.out.println("Checkbox Double Click");
	}
} 
class Button implements Clickable{
	@Override
	public void click(){
		System.out.println("Button click");
	}
}
public class DefaultMethod{  
	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		 button.doubleClick();
		 CheckBox cb = new CheckBox();
		 
		 cb.click();
		 cb.doubleClick();
	}
}