package io.naztech.JDBC_CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Insert {
	ArrayList<String> List=new ArrayList<String>(); 
	public ArrayList<String> insert(Connection con) {
		try {
			Statement stm = con.createStatement();
			String SQL = "INSERT INTO T_Aiswarja(Id,Name) VALUES('9','Jenny')";
			System.out.println("Records after inserting");
			stm.executeUpdate(SQL);
			Read r=new Read();
			List=r.read(con);
			
	} catch (SQLException e) {
			e.printStackTrace();
		}
		return List;
	
	}	
		
	
}

