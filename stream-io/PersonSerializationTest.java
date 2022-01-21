import java.io.*;
 
public class PersonSerializationTest {
	public static void deserializePerson(){
		File fileObject = new File("c://person.ser");
        
        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(fileObject))) {

                // Read (or deserialize) the three objects
                Person john = (Person)ois.readObject();
                Person wally = (Person)ois.readObject();
                Person scott = (Person)ois.readObject();
         
                // Let's display the objects that are read
                System.out.println(john);
                System.out.println(wally);
                System.out.println(scott);
                 
                // Print the input path
                System.out.println("Objects were read from " +
                                   fileObject.getAbsolutePath());
        }
        catch(FileNotFoundException e) {
               System.out.println("File not Found");
        }
        catch(ClassNotFoundException | IOException e) {
                e.printStackTrace();
        }
	}
		public static void serializePeron(){

            Person john = new Person(1, "John", "Male", "johsn@example.com");
            Person wally = new Person(2, "Wally", "Male", "wally@example.com");
            Person katrina = new Person(3, "scott", "Male", "scott@example.com");

            // The output file
            File fileObject = new File("c://person.ser");

            try (ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(fileObject))) {

                   
                    oos.writeObject(john);
                    oos.writeObject(wally);
                    oos.writeObject(katrina);

                 
                    System.out.println("Objects were written to " +
                                       fileObject.getAbsolutePath());
            }
            catch (IOException e) {
                   e.printStackTrace();
            }
		}
        public static void main(String[] args) {
        	//serializePeron();
              deserializePerson(); 
        }
}