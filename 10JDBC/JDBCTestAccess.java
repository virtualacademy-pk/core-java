

import java.sql.*;

public class JDBCTestAccess {
	public static void main(String args[]){
		try{  
			  
			  String url="jdbc:ucanaccess://D://workspace-umt//jdbc//src//hr.accdb;memory=false";  
			//step1 load the driver class  
			  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(url); 
			  
			//step3 create the statement object  
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
