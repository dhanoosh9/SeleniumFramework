package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDataProvider {
	WebDriver driver;

	@Test(dataProvider = "create")
	public void test1(String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		driver.quit();
	}
	
	@DataProvider(name = "create")
	public Object[][] dataset1() {
		
		return new Object[][]
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
				};
		
	}
	
	@DataProvider
	public Object[][] dataset() {
		
		Object[][] dataset = new Object[4][2];
		
		//first row
		dataset[0][0] = "user1";
		dataset[0][1] = "user1";
		
		//second row
		dataset[1][0] = "user2";
		dataset[1][1] = "user2";
		
		//third row
		dataset[2][0] = "user3";
		dataset[2][1] = "user3";
		
		//fourth row
		dataset[3][0] = "user4";
		dataset[3][1] = "user4";
		
		return dataset;
	}
	
}
