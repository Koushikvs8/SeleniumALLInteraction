package SeleniumInteractions;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
  
	@Test
	void dropdown() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropC=driver.findElement(By.xpath("//select[@id='country']"));
		Select options=new Select(dropC);
		
	List<WebElement> option = options.getOptions();
		
		for(int i =0;i<=(option.size()-1) ;i++)
		{
			option.get(i).click();
			Thread.sleep(1000);
			
		}
		WebElement dropC1=driver.findElement(By.xpath("//select[@id='colors']"));
		Select options1=new Select(dropC1);
		for(int i =0;i<=(3) ;i++)
		{ Thread.sleep(1000);
			options1.selectByVisibleText("Red");
			
		}
		 driver.close();
	}
	
}
