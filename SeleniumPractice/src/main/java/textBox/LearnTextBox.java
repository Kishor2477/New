package textBox;

import static org.testng.Assert.assertEquals;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.netty.util.internal.AppendableCharSequence;

public class LearnTextBox extends BaseClass{

	@Test
	public void textBoxValues() {
	driver.findElement(By.xpath("//*[@class='pi pi-server layout-menuitem-icon']")).click();
	driver.findElement(By.linkText("Text Box")).click();
	driver.findElement(By.id("j_idt88:name")).sendKeys("Null");
	WebElement findElement = driver.findElement(By.id("j_idt88:j_idt91"));
	boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
	System.out.println(enabled);
	assertEquals(enabled, false);
	driver.findElement(By.id("j_idt88:j_idt95")).clear();
	try {
		Thread.sleep(4000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	//String string = driver.findElement(By.id("j_idt88:j_idt97")).getText();
	String attribute = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
	
	System.out.println(attribute);
	if(attribute.contains("My learning is superb so far.")) {
		System.out.println("The Value is Correct");
	}else {
		System.out.println("The Value is Incorrect");
	}
	WebElement findElement2 = driver.findElement(By.id("j_idt88:j_idt99"));
	findElement2.sendKeys("xyz@abc.com",Keys.TAB);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String accessibleName = driver.findElement(By.id("j_idt88:j_idt101")).getAccessibleName();
	System.out.println(accessibleName);
	assertEquals(accessibleName, "About yourself");
	
	
	driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
	String text = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
	assertEquals(text, "Age is mandatory");
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
	
	WebElement element = driver.findElement(By.id("j_idt106:auto-complete_input"));
	element.sendKeys("Name");
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
	element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
	
	/*
	 * Select select = new Select(element); select.selectByIndex(2);
	 */
	driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("01/01/1940");
	driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("12");
	//driver.findElement(By.className("ui-icon ui-c ui-icon-triangle-1-n")).click();
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		
	}
	}
	}

