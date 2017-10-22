import java.sql.*;
import java.util.Scanner;

public class Pasd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        User u=new User();
        Connection con=null;
        int op,userid,res;
        String username,password;
        System.out.println("1.Create Account\n2.Delete Account\n3.Update Account\n4.All accounts\n5.Exit");
        System.out.print("Enter your option");
        op=sc.nextInt();
        switch(op) {
        
        case 1:
        	     System.out.print("Enter User Id :");
        	     userid=sc.nextInt();
        	     System.out.println("Enter User Name :");
                 username=sc.next();
                 System.out.println("Enter password :");
                 password=sc.next();
			try {
				con=ConnectionFactory.getConnection();
			    u.craeteaccount(con, userid, username, password);
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			     System.out.println("Account created");
                 break;
        case 2:
        	       System.out.println("Enter delete User Id :");
        	       userid=sc.nextInt();
			try {
				con=ConnectionFactory.getConnection();
     	       u.deleteaccount(con, userid);
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        	       System.out.println("Account deleted");
                    break;
        case 3:
        	        String newpassword;
        	        System.out.print("Enter User Id :");
           	     userid=sc.nextInt();
                    System.out.println("Enter new password :");
                    newpassword=sc.next();
			try {
				 con=ConnectionFactory.getConnection();
                 u.updateaccount(con, userid, newpassword);
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
        	        
        }
	}

}
