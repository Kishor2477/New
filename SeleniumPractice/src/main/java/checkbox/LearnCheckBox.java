package checkbox;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import textBox.BaseClass;

public class LearnCheckBox extends BaseClass{
	@Test
	public void learncheck() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Check Box")).click();
		//driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']")).click();
		//driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ')])[1]"));
		driver.findElement(By.className("ui-chkbox-label")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(4000);
		//Alert alert = driver.switchTo().alert();
		//alert.getText();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
		 * //wait.until(ExpectedConditions.alertIsPresent()); WebElement findElement =
		 * driver.findElement(By.partialLinkText("Checked"));
		 * wait.until(ExpectedConditions.invisibilityOf(findElement));
		 */
		
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-blank'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c']")).click();
		Thread.sleep(2000);
	}
	
}
