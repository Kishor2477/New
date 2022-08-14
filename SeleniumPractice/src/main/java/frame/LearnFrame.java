package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import textBox.BaseClass;

public class LearnFrame extends BaseClass {
	
	@Test
	public void frameLearn() {
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Frame")).click();
		WebDriver frame = driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		//driver.switchTo().frame(1);
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
	}

}
