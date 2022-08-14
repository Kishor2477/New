package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import textBox.BaseClass;

public class LearnSeleniumWaits extends BaseClass{
	@Test
	public void seleniumWaits() {
		driver.findElement(By.xpath("//*[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Waits")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);
}
	
	
	

}
