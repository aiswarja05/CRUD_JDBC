package io.naztech.JDBC_CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Update {
	public ArrayList<String> update(Connection con) {
		ArrayList<String> List=new ArrayList<String>(); 
		try {
			Statement stm = con.createStatement();
			String SQL = "UPDATE T_Aiswarja SET Name='Jarin', Address='Kakrail' where id=8";
			stm.executeUpdate(SQL);
			System.out.println("Records after Updating table");
			Read r=new Read();
			List=r.read(con);
			
	} catch (SQLException e) {
			e.printStackTrace();
		}
		return List;
	
	}	
}
