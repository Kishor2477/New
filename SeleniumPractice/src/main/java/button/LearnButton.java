package button;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import textBox.BaseClass;

public class LearnButton extends BaseClass{
	@Test
	public void buttons() {
		driver.findElement(By.xpath("//*[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Button")).click();
		WebElement webElement = driver.findElement(By.id("j_idt88:j_idt90"));
		webElement.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Button")).click();
		//WebElement webElement = driver.findElement(By.id("j_idt88:j_idt90"));
		//webElement.click();
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		assertEquals(enabled, false);
		System.out.println(enabled);
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Submit']"));
		Actions builder = new Actions(driver);
		int x = findElement.getLocation().getX();
		int y = findElement.getLocation().getY();
		
		System.out.println("X location is" + x + "Y Location is" + y );
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Save']"));
		String cssValue = findElement2.getCssValue("color");
		System.out.println(cssValue);
		String asHex = Color.fromString(cssValue).asHex();
		System.out.println("The Color is "+ asHex);
		
		Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println(size);
		builder.moveToElement(driver.findElement(By.id("j_idt88:j_idt100"))).perform();
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
