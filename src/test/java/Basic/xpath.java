package Basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//WebDriverWait wait=new WebDriverWait(driver, Timeout).until(ExpectedCondition.)
		//wait.until(ExpectedCondition);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("hp laptop");
		
	}

}
