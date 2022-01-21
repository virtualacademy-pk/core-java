 
import java.io.*;
public class DataIOWritingPrimitives {
		public static void writeFile(){
			  String destFile = "c://primitives.dat";
              
              try (DataOutputStream dos = new DataOutputStream(
                                       new FileOutputStream(destFile))) {
 
                    
                      dos.writeInt(765);
                      dos.writeDouble(6789.50);
                      dos.writeBoolean(true);
                      dos.writeUTF("Java Input/Output is cool!");
               
                      
                      dos.flush();

                      System.out.println("Data has been written to " +
                                         (new File(destFile)).getAbsolutePath() );
              }
              catch (FileNotFoundException e) {
                     System.out.println("File Not Found");
                     
              }
              catch (IOException e) {
                     e.printStackTrace();
              }
		}
		public static void readFile(){
			String srcFile = "c://primitives.dat";
            
            try (DataInputStream dis = new DataInputStream(
                    new FileInputStream(srcFile))) {
                    // Read the data in the same order they were written
                    int intValue = dis.readInt();
                    double doubleValue = dis.readDouble();
                    boolean booleanValue = dis.readBoolean();
                    String msg = dis.readUTF();

                    System.out.println(intValue);
                    System.out.println(doubleValue);
                    System.out.println(booleanValue);
                    System.out.println(msg);
            }
            catch (FileNotFoundException e) {
                    System.out.println("File Not Found");
            }
            catch (IOException e) {
                    e.printStackTrace();
            }
		}
        public static void main(String[] args) {
        	readFile();
        }
}