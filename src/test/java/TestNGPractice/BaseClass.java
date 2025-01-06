package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	Properties prop;
    @BeforeClass
    @Parameters("browser")
	public void Setup(String browserTNG ) throws IOException
	{  
    	 prop =new Properties();
    	 FileInputStream file=new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\config.properties"));
    	 prop.load(file);
    	 String url=prop.getProperty("Url");
    	 String browser=prop.getProperty("browser");
    	 
    	 if(browserTNG.equalsIgnoreCase("chrome"))
    	 {
    		 driver=new ChromeDriver(); 
    	 }
    	 else if (browserTNG.equalsIgnoreCase("ff")) {
    		 driver=new FirefoxDriver();
		}
    	 else if (browserTNG.equalsIgnoreCase("EG")) {
    		 driver=new EdgeDriver();
 		}
    	 
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}
    
    
    @Test(priority = 0 ,dataProvider = "ddt",dataProviderClass = Utilities.DataProviders.class)
    void login(String name ,String psw) throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(psw);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[@id='log-in']")).click();
    	driver.navigate().back();
    	driver.findElement(By.xpath("//input[@id='username']")).clear();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='password']")).clear();
    
    }
    @Test(priority = 1 ,enabled = false)
    void Validate_Navigation_HomeScreen() throws InterruptedException
    {
    	driver.findElement(By.xpath("//div[@class='logged-user-w']//img")).isDisplayed();
    	AssertJUnit.assertTrue(true);
    	driver.navigate().back();
    }
    @Test(priority = 2,enabled = false)
    void Fail() throws InterruptedException
    {
    	
    	
    }
    
    
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
}
