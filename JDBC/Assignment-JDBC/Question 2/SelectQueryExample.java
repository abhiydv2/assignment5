package Assignmentjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryExample {

	public static void main(String[] args)  {
		Connection conn=null;
		
		
		try{Class.forName("org.mariadb.jdbc.Driver");
		
	if(conn!=null)
		System.out.println("DB Connected");

	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from employee");
	while(rs.next()) {
		
		int id=rs.getInt("EMPNO");
		String name=rs.getString("NAME");
		String city=rs.getString("ADDRESS");
		double salary=rs.getDouble("SALARY");
		System.out.println(id+" "+name+" "+city+" "+salary);
	}
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
