package PrcticeAllInteraction;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
static WebDriver driver;
	
	
    @Test
	public void Navigater()
	{   
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://testautomationpractice.blogspot.com/");
    	WebElement dropDown=driver.findElement(By.xpath("//select[@id='country']"));
         Select  options=new Select(dropDown);
         List<WebElement> option=options.getOptions();
         option.size();
       for (int i = 0; i < option.size(); i++) {
    	   options.selectByIndex(i);
	}
        try {
     
        	options.selectByVisibleText("Canada");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
      driver.quit();
	}
}
