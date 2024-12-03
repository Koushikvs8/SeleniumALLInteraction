package PrcticeAllInteraction;

import java.time.Duration;
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
    	driver.findElement(By.xpath("//a[normalize-space()='Download Files']")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
    	driver.findElement(By.xpath("//a[normalize-space()='merrymoonmary']")).click();
    	swichWindow();
    	driver.findElement(By.xpath("//span[@class='eKxDK0HhV4OsyBuRLddo']//a[@class='kv9h1Ky2YMlFhipkWdoy'][normalize-space()='Sign in']")).click();
    	
	}
    
    
    
    public static void  swichWindow()
    {
        Set<String> windows =driver.getWindowHandles();
       
        for (String windowHandle : windows) {
            driver.switchTo().window(windowHandle);
            
        }

    	
    }
	
	
	
	
}
