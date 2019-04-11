package io.naztech.JDBC_CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Delete {
	ArrayList<String> delete(Connection con) {
		ArrayList<String> List=new ArrayList<String>(); 
		try {
			Statement stm = con.createStatement();
			String SQL = "DELETE T_Aiswarja WHERE Id=9";
			stm.executeUpdate(SQL);
			System.out.println("Records after deletion");
			Read r=new Read();
			List=r.read(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return List;
	}
}