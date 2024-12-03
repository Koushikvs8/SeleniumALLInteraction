package PrcticeAllInteraction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alerts {
	@Test
	public void Alerts()
	{//button[normalize-space()='Upload Single File']
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://testautomationpractice.blogspot.com/");
    	driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
    	Alert alert1= driver.switchTo().alert();
    	alert1.accept();
    	
    	driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
    	Alert alert2= driver.switchTo().alert();
    	alert2.dismiss();
    	
    	driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
    	Alert alert3= driver.switchTo().alert();
    	alert3.sendKeys("koushik");
}
}
