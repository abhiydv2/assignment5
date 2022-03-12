package Assignmentjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {

	public static void main(String[] args)  {
		Connection conn=null;
		
		
		try{Class.forName("org.mariadb.jdbc.Driver");
		

	PreparedStatement pst=conn.prepareStatement("delete from employee where empno=?"); 
	pst.setInt(1,106);
	
	int count=pst.executeUpdate();
			System.out.println("Rows updated : "+count);
		
	}catch(ClassNotFoundException e) {
		System.out.println("Driver not found...");
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}}
