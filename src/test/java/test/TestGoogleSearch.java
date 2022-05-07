package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import pages.GoogleSearchPage;

public class TestGoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	public static void googlesearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//Go to google.com
		driver.navigate().to("https://google.com");
		
		//enter the text in search textbox
		GoogleSearchPage.textbox_search(driver).sendKeys("java");
		
		//Click on search button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.quit();
	}
}
