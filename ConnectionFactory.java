import java.sql.*;
public class ConnectionFactory {
public static Connection getConnection(){
Connection con=null; 
try{ 
	
	Class.forName("oracle.jdbc.driver.OracleDriver"); 
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","pavan2504"); 
	
} 
catch (Exception e)  { 
	
	System.out.println(e.getMessage()); 
}
return con;
}
}