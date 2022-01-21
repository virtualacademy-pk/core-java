import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCConnectionWithConfiguration {
	public static void main(String args[]) throws Exception{
		try{  
		InputStream fis =	JDBCConnectionWithConfiguration.class.getResourceAsStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");  
			  String driverClass = prop.getProperty("driverClass");
			  String user = prop.getProperty("user");
			  String password = prop.getProperty("password");
fis.close();
			  /*String url = "jdbc:mysql://vuacademy.com:3306/db4join";  
		  String driverClass = "com.mysql.jdbc.Driver";
		  String user ="cs403";
		  String password ="cs403";
		 */
		Class.forName(driverClass);  
 			Connection con = DriverManager.getConnection(url,user,password); 
			  
/*			  
	 			Class.forName(driverClass);  
				  
	 			Connection con = DriverManager.getConnection(url,"cs403","cs403"); 
*/
			  Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}

}
