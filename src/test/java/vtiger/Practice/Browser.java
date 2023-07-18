package vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Browser {

	public static void main(String[] args) throws Throwable {
		//register driver
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		//connection of database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_data","root","tiger");
		//create sql stmt
		Statement stat = conn.createStatement();
		String query = "select*from student";
		//step 4:Execute query
		ResultSet result = stat.executeQuery(query);
		while (result.next()) {
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
			
		}
		//step 5:close database connection
		conn.close();
	}

}
