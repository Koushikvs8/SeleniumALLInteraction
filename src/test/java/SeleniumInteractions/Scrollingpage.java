package SeleniumInteractions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollingpage {
WebDriver driver;
	
	@Test
void Scrolling_Page() throws InterruptedException
{  driver=new ChromeDriver();
    driver.get("https://live.techpanda.org/index.php/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    WebElement element=driver.findElement(By.xpath("//address[@class='copyright']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);", element);
    Thread.sleep(3000);
	driver.close();
}
}
