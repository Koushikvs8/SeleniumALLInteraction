package SeleniumInteractions;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tables {
	@Test
	void StaticTable() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		///////Static Table/////////////////////////
		int row=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		
		for(int r=1; r<=row; r++ )
		{
			if(r==1)
			{
				for (int h=1; h<=4; h++)
				{
					driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr/th["+h+"]"));
					System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr/th["+h+"]")).getText()+"   |    ");
				}
			}
			else
			{System.out.println("\n");
				for (int c=1; c<=4; c++)
				{
					
					System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText()+"   |    ");
				}
				System.out.println("\n"+"================================================================");
			}
		}
	}
	//td[text()='Chrome']/following-sibling::td[contains(text(), 'Mbps')] 
	//tbody[@id='rows']/tr/td[1]
	@Test
	void DynamicTable() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		///////Dynamic Table/////////////////////////
		int rows=driver.findElements(By.xpath("//tbody[@id='rows']/tr")).size();
		
			List<WebElement> Country =driver.findElements(By.xpath("//tbody[@id='rows']/tr/td[1]"));
			for(WebElement w:Country)
			{
		
				if (w.getText().equals("Chrome"))
				{   System.out.println("========================================");
					String value=driver.findElement(By.xpath("//td[text()='Chrome']/following-sibling::td[contains(text(), '%')] ")).getText();
					System.out.println(value);
				}
				 
			}
			
			
			
		
		
}
}


