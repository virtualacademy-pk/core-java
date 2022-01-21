import java.io.*;
public class FilterInputStreamDemo {
   public static void main(String[] args) throws Exception {
       InputStream is = null; 
      FilterInputStream fis = null;
      int i=0;
      File file = new File("C://abc.txt");
      byte[] buffer = new byte[(int)file.length()];
       try{
          is = new FileInputStream(file);
         fis = new BufferedInputStream(is);
          i = fis.read(buffer);
          System.out.println("Number of bytes read: "+i);
          for(byte b:buffer)
         {
             System.out.print((char)b);
         }
      }catch(IOException e){
          e.printStackTrace();
      }finally{
         if(is!=null)
            is.close();
         if(fis!=null)
            fis.close();
      }
   }
}