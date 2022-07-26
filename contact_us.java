package aa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class contact_us extends Generic {
    @Test
    public void ContactUs() {
    driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
    driver.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
     Set<String> win=driver.getWindowHandles();
        Iterator<String> it=win.iterator();
        String parentId=it.next();
        String childId=it.next();
       driver.switchTo().window(childId);
        driver.manage().window().maximize();
    driver.findElement(By.name("name")).sendKeys("paru");
    driver.findElement(By.name("email")).sendKeys("paru@200gmail.com");
    driver.findElement(By.name("phone")).sendKeys("9876543210");
    driver.findElement(By.name("message")).sendKeys("hello paru");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
}

}