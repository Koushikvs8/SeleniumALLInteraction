package Practicesession2;

import java.time.Duration;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	WebDriver driver;
	  WebElement webelement; 
	
	public void Interactions() throws InterruptedException
	 {
		 driver =new ChromeDriver();
		 ///navigation
		 driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 Actions action =new Actions(driver);
		 driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("koushik vittal shet");
		 action.keyDown(Keys.CONTROL).sendKeys("A").perform();
	     action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	     
	     driver.findElement(By.xpath("//input[@id='phone']")).click();
	     action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	 }
}
