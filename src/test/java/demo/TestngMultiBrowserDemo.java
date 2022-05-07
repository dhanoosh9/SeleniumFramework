package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngMultiBrowserDemo {
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) {
		System.out.println("Browser name is: "+browserName);
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
	
	@Test(priority = 3)
	public void test1() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		driver.get("https://facebook.com");
		Thread.sleep(4000);
	}
	
	@Test(priority = 1)
	public void test3() throws InterruptedException {
		driver.get("https://instagram.com");
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
}
