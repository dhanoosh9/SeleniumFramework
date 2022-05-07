package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String args[]) {
		googleSearch();
	}
	
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("https://google.com");
		GoogleSearchPageObjects searchPageObject = new GoogleSearchPageObjects(driver);
		
		searchPageObject.setTextInSearchBox("java");
		searchPageObject.clickSearchButton();
		
		driver.close();
	}
}
