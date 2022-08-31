package com.leaftaps.selenium.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.leaftaps.selenium.api.design.Browser;
import com.leaftaps.utils.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBase extends Reporter implements Browser{
	public RemoteWebDriver driver;
	public WebDriverWait wait;
	int i=1;
	
	public RemoteWebDriver startApp(String url) {
		return startApp("chrome",url);
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		catch(Exception e){
			System.out.println("No Exception occurs");
			
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

	
	
	
	public WebElement locateElement(String value) {
		WebElement findElementById;
		try {
			findElementById = driver.findElement(By.id(value));
		} catch (NoSuchElementException e) {
			reportStep("The Element Not Found with value: "+value, "fail");
			throw new RuntimeException();
		}
		return findElementById;
	}
	
	public WebElement locateElement(String locator,String value) {
		try {
			switch(locator.toLowerCase()) {
			case "id" : driver.findElement(By.id(value));
			case "name" : driver.findElement(By.name(value));
			case "class" : driver.findElement(By.className(value));
			case "link": return driver.findElement(By.linkText(value));
			case "xpath": return driver.findElement(By.xpath(value));
			}
		}catch(NoSuchElementException e) {
				reportStep("Element not traceable", "fail");
			}
		return null;
		}
	

	public void click(WebElement ele) {
		String text;
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		text = ele.getText();
		ele.click();
		reportStep("Element Clicked Successfully"+text, "pass");
		} catch(StaleElementReferenceException e) {
			
		}
		
		
	}
	public void switchToAlert() {
		try {
			driver.switchTo().alert();
		}catch(Exception e) {
			reportStep("No Alert Present", "fail");
		}
	}
	
	public void acceptAlert() {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			reportStep("Alert is Present", "pass");
		}catch(Exception e) {
			reportStep("Failed on ALert Step", "fail");
		}
	}
	
	public void alertDismiss() {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			reportStep("Alert is dismissed","fail");
		}catch(Exception e) {
			reportStep("Alert is not Dismissed", "fail");
		}
	}
	


}
