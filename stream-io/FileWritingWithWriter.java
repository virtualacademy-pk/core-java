import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileWritingWithWriter {
        public static void main(String[] args) {
                // The output file
                String destFile = "c://abc.txt";
 
                try  {
                	BufferedWriter bw = new BufferedWriter(new FileWriter(destFile,true));
                        // Write the text to the writer
                	bw.newLine();    
                	bw.append("Added New line");
                                               // Flush the written text
                        bw.flush();
 
                        System.out.println("Text was written to " +
                                           (new File(destFile)).getAbsolutePath());
                }
                catch (FileNotFoundException e1) {
                       System.out.println("File Not Found");
                }
                catch (IOException e2) {
                       e2.printStackTrace();
                }
        }
}