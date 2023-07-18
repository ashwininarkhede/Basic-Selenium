package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("src/main/resources/PropertyFile.properties");
		Properties pro=new Properties();
		pro.load(fis);
		 String URL = pro.getProperty("url");
		 String username = pro.getProperty("username");
		 String password = pro.getProperty("password");
		 driver.get(URL);
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 driver.findElement(By.id("loginButton")).click();

	}

}
