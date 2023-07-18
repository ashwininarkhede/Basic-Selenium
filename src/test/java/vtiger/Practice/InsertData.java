package vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertData {
	public static void main(String[] args) throws Throwable {
		//register driver
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		//connection of database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_data","root","tiger");
		//create sql stmt
		Statement stat = conn.createStatement();
		String query = "insert into student(FIRST_NAME,LAST_NAME)values('Ananta','Narkhede')";
		int result = stat.executeUpdate(query);
		if (result==1) {
			System.out.println("User is created");
			
		}
		else
		{
			System.out.println("user is not created");
		}
		conn.close();
	}

}
