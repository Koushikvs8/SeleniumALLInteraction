package TestNGTrails;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.FileInputStream;

public class DemoDataprovider {
	WebDriver driver;
	Properties prop;
	
    @BeforeMethod
	public void Setup() throws FileNotFoundException
	
	{ 
       System.out.println(System.getProperty("user.dir"));
    	prop = new Properties();
    	FileInputStream  file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities\\config.properties");
    	try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(prop.getProperty("Url"));
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
	}
    
    @Test(priority = 0, dataProvider = "login" ,dataProviderClass = Utilities.DataProviders.class)
    void login(String name ,String pwd) throws InterruptedException
    {
    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[@id='log-in']")).click();
    	driver.findElement(By.xpath("//div[@class='logged-user-w']//img")).isDisplayed();
    	Assert.assertTrue(true);
    }
    
    
    
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
}
