package PrcticeAllInteraction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigatetion {
	static WebDriver driver;
	
	
    @Test
	public void Navigater()
	{   
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://testautomationpractice.blogspot.com/");
    	String parentWindow=driver.getWindowHandle();
    	driver.findElement(By.xpath("//button[@id='PopUp']")).click();
    	//driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
    	swichWindow(parentWindow);
    
    	
	}
    
    
    
    public static void  swichWindow(String parentWindow)
    {
        Set<String> windows =driver.getWindowHandles();
  
	
        for (String windowHandle : windows) {
            driver.switchTo().window(windowHandle);
        }
      
    	
    }
	
	
	
	
}
