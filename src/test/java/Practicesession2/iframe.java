package Practicesession2;

import java.time.Duration;

import org.openqa.selenium.By;
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
			     driver.get("https://practice.expandtesting.com/iframe");
			     driver.switchTo().frame("mce_0_ifr");
			     WebElement ddd= driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));
			     ddd.clear();
			   ddd.sendKeys("koushik you can do it");
			     driver.quit();
		}      
}
