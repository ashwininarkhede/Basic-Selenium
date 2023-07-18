package DDT;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileRead {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty("username");
		String value1 = p.getProperty("password");
		//p.getProperty("url");
		System.out.println(value);
		System.out.println(value1);

	}

	
}
