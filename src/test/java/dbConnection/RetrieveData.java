package dbConnection;
import java.sql.*;
public class RetrieveData {

	public static void main(String[] args) throws Throwable {
		String url = "jdbc:mysql://localhost:3306";
		
		String userName= "root";
		String password = "123456";
		String query = "SELECT * FROM hr.employees WHERE job_id = 'IT_PROG';";
		
		
		// Step1 make sure we have dependencies in POM.XML
		//STEP 2 Load the DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,userName,password);
		
		Statement stm = con.createStatement();
	ResultSet rs=	(stm).executeQuery(query);
	while(rs.next())
	{
		System.out.println(rs.getString("first_name"));
		System.out.println();
	}
		
	} 
}/* 
		        // step4 create statement obj
		        // that allow us to perform different database operations(SELECT,INSERT,DELETE)
		        Statement stm =   con.createStatement();
		        
		        // Step 5 Execute query and store in the Resultset
		        ResultSet rs = (stm).executeQuery(query);
		        
		        // Step6 iterate through the result to access the data
		        // in the table that returned by the
		        while (rs.next()) {
		           
		            System.out.println(rs.getString("job_id"));
		            System.out.println(rs.getString("salary");
		System.out.println();  */
	
