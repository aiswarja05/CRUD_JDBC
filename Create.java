package io.naztech.JDBC_CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Create {
	ArrayList<String> List=new ArrayList<String>(); 
	public ArrayList<String> create(Connection con) {
		try {
			Statement stm = con.createStatement();
			String SQL = "CREATE TABLE T_Joye (CustomerId INT IDENTITY(1,1) PRIMARY KEY, CustomerName VARCHAR(225) NOT NULL, Email VARCHAR(225), Age INT)";
			System.out.println("Created Table");
			stm.executeUpdate(SQL);
			
			String SQL1="INSERT INTO T_Joye (CustomerName) SELECT Name FROM T_Aiswarja";  //coping T_Aiswarja table values in T_Joye
			stm.executeUpdate(SQL1);
			
			String SQL2="SELECT * FROM T_AISWARJA";
			ResultSet rs=stm.executeQuery(SQL2);
			System.out.println("Records of new table");
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
