import java.sql.*;

public class User {
	
	public void craeteaccount(Connection c,int UserId,String Username,String password) {
		
		try {
			PreparedStatement ps=c.prepareStatement("insert into account values(?,?,?)");
			ps.setInt(1,UserId);
			ps.setString(2,Username);
			ps.setString(3,password);
			int res=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	public void updateaccount(Connection c,int UserId,String password) {
		
		try {
			PreparedStatement ps=c.prepareStatement("update  account set password=? where UserId=?");
			ps.setString(1,password);
			ps.setInt(2,UserId);
			int res=ps.executeUpdate();
			System.out.println("Passsword Change Successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void deleteaccount(Connection c,int UserId) {
		
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("delete from account  where UserId=?");
			ps.setInt(1,UserId);
			int res=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
}
