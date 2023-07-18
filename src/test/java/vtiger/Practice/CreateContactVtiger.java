package vtiger.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactVtiger {

	public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
    driver.manage().window().maximize();
    driver.findElement(By.name("user_name")).sendKeys("admin");
    driver.findElement(By.name("user_password")).sendKeys("admin");
    driver.findElement(By.id("submitButton")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
    Thread.sleep(2000);
   // driver.findElement(By.name("salutationtype")).click();
    driver.findElement(By.name("lastname")).sendKeys("Narkhede");
    driver.findElement(By.name("button")).click();
    driver.findElement(By.xpath("(//img[@border='0'])[3]")).click();
    driver.findElement(By.linkText("Sign Out")).click();
   
	}

}
