import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrames {
    WebDriver driver;
    @Test
    void Iframe() throws InterruptedException
    {
    	
    	driver=new ChromeDriver();
    	driver.get("https://demo.guru99.com/test/guru99home/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	System.out.println(driver.findElements(By.tagName("iframe")).size());
    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src, 'RbSlW8jZFe8')]")));
    	//same as frame by index
    	//driver.switchTo().frame(0);
    	driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']")).click();
   

    	Set <String> handles=driver.getWindowHandles();
    	/////converting Set to list/////
    	List <String> handles1=new ArrayList<String>(handles);
    	System.out.println(handles1);
    	for(String W:handles)
    	{      
    		System.out.println(W);
    		Thread.sleep(3000);
    		String title= driver.switchTo().window(W).getTitle();
    		System.out.println(title);
    		String Actual_title="Automation Testing Tutorial for Beginners - YouTube";
    		if(title.equals(Actual_title))
    		{
    			driver.switchTo().window(W);
    			Thread.sleep(3000);
    	    	driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
    	    	
    	    	break;
    		}
    		
    	}
    	
    	driver.quit();
    	
    }
	
    
	
	
}
