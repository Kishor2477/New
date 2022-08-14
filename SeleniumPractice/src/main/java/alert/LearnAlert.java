package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import textBox.BaseClass;

public class LearnAlert extends BaseClass{

	@Test
	public void alertLearn() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Alert")).click();
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(1000);
		
	}
}
