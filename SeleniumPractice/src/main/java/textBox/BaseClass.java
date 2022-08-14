package textBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	public Properties prop;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 //Step1
		 prop = new Properties();
		 File file = new File("./src/main/resources/config.properties");
		 FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		 
		 driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
