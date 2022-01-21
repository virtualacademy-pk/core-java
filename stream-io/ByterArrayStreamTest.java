import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByterArrayStreamTest {
	public static void writeFile(){
		try {
			ByteArrayOutputStream bout =  new ByteArrayOutputStream();
			
			FileOutputStream fout = new FileOutputStream("c:/abc.txt");
			String s = "\nWriting through ByteArrayOutputStram";
			byte b[] = s.getBytes();// converting string into byte array
			bout.write(b);
			bout.writeTo(fout);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void readFile()throws Exception{
		try {
			
			File file =  new File("c:/abc.txt");
			FileInputStream fin = new FileInputStream(file);
			byte b[] = new byte[(int)file.length()];
			 
			ByteArrayInputStream bin =  new ByteArrayInputStream(b);
			fin.read(b);
			 int i =0;
			 while((i=bin.read()) != -1){
				 System.out.print((char)i);
				 
			 }
			 } catch (Exception e) {
			System.out.println(e);
		}
	}
	 public static void main(String[] args) throws Exception{
	    	writeFile();
	    	readFile();
	    }
}
