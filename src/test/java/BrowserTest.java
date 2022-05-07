import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
		driver.findElement(By.xpath("(//input[contains(@aria-label,'Search')])[1]")).sendKeys("java");
		WebElement gmail = driver.findElement(By.xpath("//a[contains(.,'Gmail')]"));
		gmail.click();
		Thread.sleep(3000);
		driver.close();
	}
}
