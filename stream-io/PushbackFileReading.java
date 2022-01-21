
import java.io.PushbackInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class PushbackFileReading {
        public static void main(String[] args) {
                String srcFile = "c:/abc.txt";
                try (PushbackInputStream pis = new PushbackInputStream(
                        new FileInputStream(srcFile))) {
                        byte byteData;
                        while ((byteData = (byte) pis.read()) != -1) {
                                System.out.print((char) byteData);
                                pis.unread(byteData);
                                byteData = (byte) pis.read();
                                System.out.print((char) byteData);
                        }
                }
                catch (FileNotFoundException e1) {
                        System.out.println("File Not Found");
                }
                catch (IOException e2) {
                        e2.printStackTrace();
                }
        }
}