package Basic;

import java.awt.Event;

import org.apache.poi.ss.formula.functions.Even;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart  {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobile");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F04 (Opal Green, 64 GB)']"));
	Thread.sleep(2000);
	String price = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F04 (Opal Green, 64 GB)']/parent::div/parent::div/descendant::div[6]")).getText();
	System.out.println("price of mobile is:"+price);
	}
	
	

}
