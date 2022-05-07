package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG1 {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public static void PG1test() {
		String URL = "http://demo.guru99.com/test/newtours/";
		String ExpextedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(URL);
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(ExpextedTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}
	}
	
	@AfterTest
	public static void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
}
