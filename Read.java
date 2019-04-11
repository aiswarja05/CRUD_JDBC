package io.naztech.JDBC_CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Read {
	ArrayList<String> List=new ArrayList<String>(); 
	public ArrayList<String> read(Connection con) {
	try {
		Statement stm = con.createStatement();
		String SQL="SELECT * FROM T_AISWARJA";
		ResultSet rs=stm.executeQuery(SQL);
		
		while(rs.next()) {
			String result=rs.getString("Id") +" " +rs.getString("Name");
		List.add(result);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return List;
	}
}
