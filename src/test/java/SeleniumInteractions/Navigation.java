package SeleniumInteractions;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	static WebDriver driver ;
	
@Test
 void Navigate() throws InterruptedException
{
driver = new ChromeDriver();
driver.get("https://ultimateqa.com/complicated-page");
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
Set<String> windowsIDs=driver.getWindowHandles();
for(String W:windowsIDs)
{      
	System.out.println(W);
	String title= driver.switchTo().window(W).getTitle();
	System.out.println(title);
}
driver.manage().window().maximize();
	driver.close();
}

@Test
void Windowhandle()  throws InterruptedException
{driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[id = 'PopUp']")).click();
Thread.sleep(1000);
Set<String> windowsIDs=driver.getWindowHandles();
List<String> windowlist=new  ArrayList<String>(windowsIDs);

String parentId=windowlist.get(0);
String childId=windowlist.get(1);
driver.switchTo().window(childId).getTitle();
driver.close();



}
}
