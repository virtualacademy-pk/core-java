import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
 
public class FileWritingWithPrintStream {
        public static void main(String[] args) {
                String destFile = "c:/abc.txt";
                 
                try (PrintStream ps = new PrintStream( new FileOutputStream("c:/abc.txt",true))) {
                        ps.println("Upon the moon I fix'd my eye,");
                        ps.println("All over the wide lea;");
                        ps.println("With quickening pace my horse drew nigh");
                        ps.print("Those paths so dear to me.");
 
                        ps.flush();
 
                        System.out.println("Text has been written to " +
                                           (new File(destFile).getAbsolutePath()));
                }
                catch (FileNotFoundException e1) {
                        System.out.println("File not found");
                }
        }
}