package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url = "jdbc:mysql://localhost:3306";
		
		String userName= "root";
		String password = "123456";
		String query = "insert into voter.vote VALUES(129, 'Rifat','G','ban', 25);";
		
		
		// Step1 make sure we have dependencies in POM.XML
		//STEP 2 Load the DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,userName,password);
		
		Statement stm = con.createStatement();
	//ResultSet rs=	(stm).executeQuery(query);
	
	stm.executeLargeUpdate(query);
	System.out.println("Updation DONE");
	con.close();
	stm.close();

	}

}
