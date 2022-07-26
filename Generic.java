package aa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Generic {
	WebDriver driver;
	@Test
	public void open() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	}

}
