

import java.sql.*;

public class JDBCTestSQLServer {
	public static void main(String args[]){
		try{  
			//step1 load the driver class  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
					"jdbc:sqlserver://localhost\\SQL2K8R2STD:1433;DatabaseName=scott","sa","asdnb@131"); 
			  
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
