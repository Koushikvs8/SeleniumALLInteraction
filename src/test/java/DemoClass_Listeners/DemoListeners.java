package DemoClass_Listeners;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoClass_Listeners.Listeners.class)
public class DemoListeners {
    WebDriver driver;
    @BeforeClass
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.applitools.com/index.html");
	}
    @Test(priority = 0)
    void login() throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("koushik");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kou@1234");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[@id='log-in']")).click();
    
    }
    @Test(priority = 1)
    void Validate_Navigation_HomeScreen() throws InterruptedException
    {
    	driver.findElement(By.xpath("//div[@class='logged-user-w']//img")).isDisplayed();
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	    File sourcefile =ts.getScreenshotAs(OutputType.FILE);
    	    File targetfileFile = new File(System.getProperty("user.dir")+"\\screenshots\\"+System.currentTimeMillis()+"SS.png");
    	    sourcefile.renameTo(targetfileFile);
    	
    }
    @Test(priority = 2)
    void Fail() throws InterruptedException
    {
    	Assert.assertTrue(false);
    	
    }
    
    
	@AfterClass
	public void TearDown()
	{
		driver.close();
	}
}
