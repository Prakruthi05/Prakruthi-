package aa;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login  extends Generic{
	@Test(dataProvider="get")
	
	public void log(String name,String word) throws InterruptedException {
		driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(word);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		}
	
	
	@DataProvider(name="get")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="prakruthi07@gmail.com";
		data[0][1]="prakruthi78";
		data[1][0]="prakruthi@gmail.com";
		data[1][1]="prakruthi789";
		return data;
	}
	
	

	

}

