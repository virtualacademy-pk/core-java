import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileIOTest {
	

	public static void writeFile(){

		try {
			FileOutputStream fout = new FileOutputStream("c:/abc.txt",true);
			String s = "Append by File Output Stream";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void readFile(){
		try {
			FileInputStream fin = new FileInputStream("c:/abc.txt");
			 int i =0;
			 while((i=fin.read()) != -1){
				 System.out.print((char)i);
				 
			 }
			 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) throws Exception{
	 File f = new File("c:/made_by_java");
	 f.mkdir();
	}

}
