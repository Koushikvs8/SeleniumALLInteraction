package Practicesession2;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe {
	  WebDriver  driver;
		@Test
		public void frameSwich() throws InterruptedException
		{
			     driver=new ChromeDriver();
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     driver.manage().window().maximize();
			     driver.get("https://testautomationpractice.blogspot.com/");
			     driver.findElement(By.xpath("//a[text()='Blogger']")).click();
			     swictchto();
			     driver.findElement(By.xpath("//header[@class=\"hero--header\"]//a[contains(text(),'Create your blog')][1]")).click();
		}    
		
		
		
		public void takess()
		{    TakesScreenshot ts=(TakesScreenshot)driver;
			 File sourcefile=   ts.getScreenshotAs(OutputType.FILE);
			 File targetfile=new File("C:\\Users\\User\\eclipse-workspace\\SeleniumFRAmwork\\ALLAutomationinteractions\\test-output"+System.currentTimeMillis()+"ss.png");
			 sourcefile.renameTo(targetfile);
			
		}
		public void swictchto()
		{     String parent=driver.getWindowHandle() ;     
			  Set<String> windows=driver.getWindowHandles();
			  Iterator< String> window=windows.iterator();
			   
			  
			while(window.hasNext()) 
			  {
				  if(!window.next().equals(parent) )
				  {
				  driver.switchTo().window(window.next());
				  }
				
			}
			 
			  
		}
		
		
		
}
