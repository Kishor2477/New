package window;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import textBox.BaseClass;

public class WindowHandles extends BaseClass{
	
	@Test
	public void windows() {
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.linkText("Window")).click();
		driver.findElement(By.id("j_idt88:new")).click();
		//String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		
		String string = windowHandlesList.get(1);
		
		driver.switchTo().window(string);
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(windowHandlesList.get(0));
		System.out.println(driver.getTitle());
	}
	
}
