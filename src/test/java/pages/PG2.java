package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PG2 {
static WebDriver driver = null;
	
	@BeforeTest
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Test
	public static void PG2test() {
		
		String baseUrl = "http://www.facebook.com";
		driver.navigate().to(baseUrl);
        WebElement tagName = driver.findElement(By.cssSelector("#email"));
        tagName.getTagName();
        tagName.sendKeys("dhanoosh.donepudi@gmail.com");
        System.out.println(tagName);
	}
	
	@AfterTest
	public static void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
}
