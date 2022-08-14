package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import textBox.BaseClass;

public class LearnDropDown extends BaseClass{

	@Test
	public void dropdown() {
		driver.findElement(By.xpath("//*[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Dropdown")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		select.selectByVisibleText("Selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Select county = new
		 * Select(driver.findElement(By.xpath("//select[@id='j_idt87:country_input']")))
		 * ; county.selectByVisibleText("India");
		 */
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
		 	driver.findElement(By.xpath("//li[text()='India']")).click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		driver.findElement(By.id("j_idt87:city_label")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		driver.findElement(By.id("j_idt87:auto-complete_input")).click();
		//driver.findElement(By.linkText("RestAssured")).click();
		//driver.findElement(By.className("ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only")).click();
		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
	
		driver.findElement(By.xpath("//li[text()='RestAssured']")).click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		Select lang = new Select(driver.findElement(By.xpath("j_idt87:lang_input")));
		lang.selectByIndex(0);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		
	}
}
