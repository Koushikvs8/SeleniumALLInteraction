package SeleniumInteractions;
import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
WebDriver driver;
@Test
void MouseActions() throws InterruptedException
{   driver =new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    Actions action =new Actions(driver);
    Thread.sleep(2000);
   /////moveto////////////
    WebElement first=driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
    action.moveToElement(first).perform();
    Thread.sleep(2000);
/////////////doubleclick
    action.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
    Thread.sleep(2000);
    //////Rigtclick//////////////
    action.contextClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
	/////drag and drop////////////

   action. dragAndDrop(driver.findElement(By.xpath("(//div[@id='draggable'])")), driver.findElement(By.xpath("//div[@id='droppable']"))).perform();
   
   
   ////////Keyword actiom/////////////////////
   
   
}
}
