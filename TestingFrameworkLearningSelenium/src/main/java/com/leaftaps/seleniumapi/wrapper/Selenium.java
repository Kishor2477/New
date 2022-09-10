package com.leaftaps.seleniumapi.wrapper;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.leaftaps.api.Browser;
import com.leaftaps.utils.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium extends Reporter implements Browser{
	
	public RemoteWebDriver driver ;
	int i=1;
	public RemoteWebDriver startApp(String url) {
		return startApp("chrome", url);
	}
	
	public RemoteWebDriver startApp(String browser,String url) {
		try {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		}catch(Exception e) {
			
	}
		return driver;
	}
	
	public int takeSnap()  {
		int randomNum = (int) (Math.random()*99999+10000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File file = new File ("./snaps/img"+randomNum+".png");
		try {
			FileUtils.copyFile(source, file);
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	return randomNum;
	}

	public void click(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			reportStep("The Click action is perfored successsfully", "pass");
			
		}catch(Exception e) {
			reportStep("The Click action not perfomed successfully","fail");
		}
		
	}
	@Override
	public WebElement locateElement(String id) {
		WebElement findElementID = null;
		try {
			findElementID = driver.findElement(By.id(id));
		} catch (Exception e) {
			reportStep("The locator is not found", "fail");
		}
		return findElementID;
	}

	public WebElement locateElement(String locator, String value) {
		try{
			switch(locator.toLowerCase()) {
			case "id" : return driver.findElement(By.id(value));
			case "class" : return driver.findElement(By.className(value));
			case "name" : return driver.findElement(By.name(value));
			case "xpath" : return driver.findElement(By.xpath(value));
			case "text" : return driver.findElement(By.linkText(value));
			}
		}catch(Exception e) {
			reportStep("The locator is not found", "fail");
		}
		return null;
	}

	public void switchToAlert() {
		driver.switchTo().alert();
		
	}

	public void acceptAlert() {
		try {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		reportStep("The alert is accepted successfully", "pass");
		}catch(Exception e) {
			reportStep("The alert is not accepted successfully", "fail");
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			reportStep("The Alert dismissed successfully", "pass");
		}catch (Exception e) {
		reportStep("The Alert is not dismissed successfully", "fail");
	}
	}

	public void getAlertText() {
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			reportStep("Alert text captured successfully", "pass");
		} catch(Exception e) {
			reportStep("Alert text is captured successfully", "fail");
		}
		
	}

	public void alertSendValues(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		
	}

	@Override
	public void switchtoFrame(int index) {
		driver.switchTo().frame(index);
		
	}

	public void switchtoFrame(String nameId) {
		driver.switchTo().frame(nameId);
	}
	
	public void switchtoFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	@Override
	public void switchtoDefaultContent() {
		driver.switchTo().defaultContent();
		
	}

	public void switchtoParentFrame() {
		driver.switchTo().parentFrame();
		
	}
	
	

	public void switchToWindow() {
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		
	}
	
	public void switchToWindows(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		String string = list.get(index);
		driver.switchTo().window(string);
	}

	public boolean verifyurl(String url) {
		boolean equals = driver.getCurrentUrl().equals(url);
		if(driver.getCurrentUrl().equals(url)) {
			System.out.println("The URL is matching"+url);
			return true;
		} else {
			System.out.println("The Url is not matching"+url);
		}
		return false;
	}
	
	public void clear(WebElement ele) {
		try {
			ele.clear();
			reportStep("Text Cleared", "pass");
		} catch (Exception e) {
			e.printStackTrace();
			reportStep("Text not Cleared successfully", "fail");
		}
	}
	public void clearAndType(WebElement ele, String value) {
		try {
			ele.clear();
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("document.getElementById('ele').value='value'");
			
				
			}catch(Exception e) {
				
			}
	}
	
	public void mouseOver(WebElement ele) {
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
	}
	
	public void keyDown() {
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.SHIFT).sendKeys("a").perform();
	}
	public void quit() {
		driver.quit();
	}
	
}
