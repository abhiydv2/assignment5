package Assignmentjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args)  {
		Connection conn=null;
	
		
		try{Class.forName("org.mariadb.jdbc.Driver");
	
	PreparedStatement pst=conn.prepareStatement("insert into employee(empno,name,address,salary) values (?,?,?,?)"); 
	pst.setInt(1,107);
	pst.setString(2, "Ananya");
	pst.setString(3, "GGN");
	pst.setDouble(4, 760000);
	int count=pst.executeUpdate();
			System.out.println("Rows updated : "+count);
		//	pst.executeQuery("select * from employee");
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
