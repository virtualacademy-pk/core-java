import java.io.*;
 
public class BufferedFileReading {
	public static void readFile(){
        String srcFile = "c:/abc.txt";
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try  {
        	fis = new FileInputStream(srcFile);
        	bis = new BufferedInputStream(fis);
                byte byteData;
                while ((byteData = (byte) bis.read()) != -1) {
                        System.out.print((char) byteData);
                }
        }
        catch (FileNotFoundException e1) {System.out.println("File not found");}
        catch (IOException e2) {e2.printStackTrace();}
        finally{
        	try{
        		if(bis!=null){ bis.close();}
        		if(fis!=null){fis.close(); }
        	}catch(IOException ex){ex.printStackTrace();}
        }
	}
	public static void writeFile(){
        String srcFile = "c:/abc.txt";
        
        try (BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(srcFile,true))) {
        bos.write("\nappending file through BufferOutputStream".getBytes());
        bos.close();        
        }
        catch (FileNotFoundException e1) {
               System.out.println("File not found");
        }
        catch (IOException e2) {
               e2.printStackTrace();
        }
	}
    public static void main(String[] args) {
    	writeFile();
    	readFile();
    }
}