package jdbcdemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student");
			// Create a statement
			Statement myStatement = myConn.createStatement();
			// Execute a SQL query
			ResultSet myRs = myStatement.executeQuery("select * from employees");
			// Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
