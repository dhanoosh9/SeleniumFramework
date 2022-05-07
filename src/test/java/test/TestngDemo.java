package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class TestngDemo {
	
	private static WebDriver driver = null;
	public static String browserName = null;
	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getproperties();
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}
	
	@Test
	public static void googlesearch() {
		
		
		//Go to google.com
		driver.navigate().to("https://google.com");
		
		//enter the text in search textbox
		GoogleSearchPage.textbox_search(driver).sendKeys("java");
		
		//Click on search button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void TearDownTest() {
		//driver.close();
		driver.quit();
		System.out.println("Test is completed succesfully");
	}
}
