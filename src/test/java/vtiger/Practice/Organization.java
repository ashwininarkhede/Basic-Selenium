package vtiger.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Organization {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	    driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.linkText("Organizations")).click();
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	    driver.findElement(By.name("accountname")).sendKeys("MyOrg");
	    WebElement data = driver.findElement(By.name("industry"));
	    data.click();
	    Select sel=new Select(data);
	    sel.selectByIndex(4);
	   // System.out.println(value);
	    driver.findElement(By.name("button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	    driver.findElement(By.linkText("Sign Out")).click();
	    
	}

}
