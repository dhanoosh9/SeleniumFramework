package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessBrowser {
	public static void main(String args[]) {
		test();
	}
	public static void test() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1366,768");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Java");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}
	
	
}

