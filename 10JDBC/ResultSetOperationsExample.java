import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetOperationsExample {
	public static void read(){
		//http://tutorials.jenkov.com/jdbc/resultset.html
		try{  
			String url = "jdbc:sqlserver://localhost\\SQL2K8R2STD:1433;DatabaseName=northwind";  
			  String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			  url = "jdbc:oracle:thin:@vuacademy.com:1521:xe";
				driverClass = "oracle.jdbc.driver.OracleDriver";
			  Class.forName(driverClass);  
			Connection con=DriverManager.getConnection(url,"northwind","northwind"); 
			String sql = "select * from categories";
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()){
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				rs.updateString(2, rs.getString(2)+"_Updated");
				//rs.updateString(2, rs.getString(2).split("_")[0]);

				 rs.updateRow();
				
			}

			// step5 close the connection object
			con.close();  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	
	}


	public static void main(String args[]){
		read();
			  
	}

}
