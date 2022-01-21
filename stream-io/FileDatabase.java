import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileDatabase {
   RandomAccessFile file;

   public FileDatabase(String fileString)         throws IOException {
      file = new RandomAccessFile(fileString, "rw");
   }

   public void close() throws IOException {
      if (file != null)
         file.close();
   }

   public PersonRecord getRecord(int id) throws IOException {
	   PersonRecord record = null;
	      try {
	         file.seek(0);
	          int recordsRead = 0;
	         while (true) {
	            do {
	            	record = new PersonRecord();
	               record.readFromFile(file);
	             } while (record.getId() == 0);
	             
	            recordsRead++;
	            if(record.getId() == id || recordsRead*94 == file.length()){
	            	if(record.getId() != id){
	            		record = null;
	            	}
	         	   break;
	            }
	         }
	      } catch (EOFException ex1) {
	         return null;
	      } catch (IOException ex2) {
	         System.err.println("error reading file");
	      }
	      return record;
   }

   public void insertRecord(PersonRecord record)
         throws IllegalArgumentException, IOException {
      if (file.length() > 0 && getRecord(record.getId()) != null)
         System.out.println("Cannot add new. Record already exists.");
      else {
    	  if(file.length()>0){
    		  int pos = (record.getId() - 1) * PersonRecord.SIZE;
    		  file.seek(pos);
    	  }
         record.writeToFile(file);
      }
   }

   public void updateRecord(PersonRecord record)
         throws IllegalArgumentException, IOException {
      if (getRecord(record.getId()) == null)
         System.out.println("Cannot update. Record does not exist.");
      else {
         file.seek((record.getId() - 1) * PersonRecord.SIZE);
         record.writeToFile(file);
      }
   }

   public void deleteRecord(PersonRecord record)
         throws IllegalArgumentException, IOException {
      if (getRecord(record.getId()) != null)
         System.out.println("Cannot delete. Record does not exist.");
      else {
         file.seek((record.getId() - 1) * PersonRecord.SIZE);
         record = new PersonRecord();
         record.writeToFile(file);
      }
   }

   public void showAllRecords() {
      PersonRecord record = new PersonRecord();
      try {
         file.seek(0);
          int recordsRead = 0;
         while (true) {
            do {
               record.readFromFile(file);
             } while (record.getId() == 0);
            System.out.println(record.toString());
            recordsRead++;
            if(recordsRead*94 == file.length()){
         	   break;
            }
         }
      } catch (EOFException ex1) {
         return;
      } catch (IOException ex2) {
         System.err.println("error reading file");
      }
   }
}