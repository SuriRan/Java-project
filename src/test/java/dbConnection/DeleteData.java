package dbConnection;
import java.sql.*;
public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
String url = "jdbc:mysql://localhost:3306";
		
		String userName= "root";
		String password = "123456";
		String query = "DELETE FROM voter.vote where age = 25;";
            Class.forName("com.mysql.cj.jdbc.Driver"); // add ClassNotFoundException
		
		Connection con = DriverManager.getConnection(url,userName,password);// add sql exception
		
		Statement stm = con.createStatement();
		stm.executeLargeUpdate(query);
		System.out.println("Deletion DONE");
		con.close();
		stm.close();
		
	}

}
