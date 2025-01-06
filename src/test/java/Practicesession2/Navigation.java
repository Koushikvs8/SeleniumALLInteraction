package Practicesession2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Navigation {
   WebDriver driver;
  WebElement webelement;
  public void Interactions() throws InterruptedException
	 {
		 driver =new ChromeDriver();
		 ///navigation
		 driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		//a[text()='Blogger']
		 //ExplicitWaite(webelement);
		 driver.findElement(By.xpath("//a[text()='Blogger']"));
		//input[@id="male"]
		 driver.findElement(By.xpath("//input[@id='male']")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isEnabled());
		 //ScrollBypixels();
		//select[@id="country"][1]
		 driver.findElement(By.xpath("//select[@id=\"country\"][1]"));
		//label[text()='Country:']
		 ScrollByElement(driver.findElement(By.xpath("//label[text()='Country:']")));
		 Select dropdown= new Select(driver.findElement(By.xpath("//select[@id=\"country\"]")));
		 dropdown.selectByIndex(3);
		 dropdown.selectByValue("germany");
		 dropdown.selectByVisibleText("Canada");
		// ScrollByElement(driver.findElement(By.xpath("//a[text()='Blogger']")));
		 //	Alert
		 driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		 Alert alert=driver.switchTo().alert();
		 Thread.sleep(2000);
		 alert.accept();
		 //file upload
		 driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys(System.getProperty("user.dir")+"\\src\\test\\java\\Utilities");
		 Thread.sleep(2000);
		driver.quit(); 
	 }
  
   public  WebElement ExplicitWaite(WebElement webelement)
   {
	   WebDriverWait wait= new  WebDriverWait(driver, Duration.ofSeconds(10));
	   WebElement  waitedElwment=    wait.until(ExpectedConditions.visibilityOf(webelement));
	   
	   return  waitedElwment;
   }
  
   public  void ScrollBypixels()
   {
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,500);");
	   
   } 
  
   public  void ScrollByElement(WebElement webelement)
   {
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView(true);", webelement);
	   
   } 
  
  
  
	
}
