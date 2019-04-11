package io.naztech.JDBC_CRUD;
import java.sql.Connection;
    	import java.sql.DriverManager;
    	import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

    	public class App {
    		static Connection con;
    	public static void main(String[] args) {
    	
    	try {
    		String url="jdbc:sqlserver://vNTDACWSSQLD002:1433;databaseName=DEV_TEST;";
    		String password="dev_test_dbo123";
    		String user="dev_test_dbo";
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    		con=DriverManager.getConnection(url, user, password);
    		
    		Insert in=new Insert();
    		System.out.println(in.insert(con));
    		
    		Delete del=new Delete();
      		System.out.println(del.delete(con));
      		
      		Update upd=new Update();
      		System.out.println(upd.update(con));
      		
      		Create crt=new Create();
      		System.out.println(crt.create(con));
    	
    	}catch( Exception e){
    	System.out.println(e);

    	}
    	
    }		
    	
}
