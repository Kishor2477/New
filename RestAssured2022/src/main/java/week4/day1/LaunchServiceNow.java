package week4.day1;

import java.security.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchServiceNow {
	
	@Test
	public void serviceNow() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev109262.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("llXHRy=@lH93",Keys.ENTER);
	//	driver.switchTo().frame(0);
//		WebElement all = driver.findElement(By.id("all")).click();
		
		WebElement findElement = driver.findElement(By.id("all"));
		Actions builder = new Actions(driver);
		//builder.click(findElement);
	//	String windowHandle = driver.getWindowHandle();
		//driver.switchTo().window(windowHandle);
		
		builder.moveToElement(findElement);
		
		
	}

}
