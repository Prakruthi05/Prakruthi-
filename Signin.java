package aa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Signin  extends Generic{
	@Test
	public void SignUp() throws InterruptedException{
		driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Prakruthi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("N");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("prakruthinanda.n01@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("paru789");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07-05-1998");
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("8884103304");
	    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("i want to order the phone");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//button[@type='Submit']")).click();
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	 
	}

}

