import java.io.*;
 
 
public class FileReadingWithReader {
        public static void main(String[] args) {
                // The output file
                String destFile = "c://abc.txt";
                String  thisLine = null;
                try  {
                	BufferedReader br = new BufferedReader(new FileReader(destFile));
                        // Write the text to the writer
                	while ((thisLine = br.readLine()) != null) {
                        System.out.println(thisLine);
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