package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	private static WebDriver driver = null;
	
	public GoogleSearchPageObjects(WebDriver driver) {
		GoogleSearchPageObjects.driver = driver;
	}
	
	 By textbox_search = By.name("q");
	 By button_search = By.xpath("(//input[contains(@name,'btnK')])[2]");
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
