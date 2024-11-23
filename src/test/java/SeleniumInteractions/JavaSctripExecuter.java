package SeleniumInteractions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaSctripExecuter {
	WebDriver driver;
	
	@Test
void JavaSctripExecuter() throws InterruptedException
{  driver=new ChromeDriver();
    driver.get("https://live.techpanda.org/index.php/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
    WebElement button=driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].setAttribute('value' ,'koushik')",search);
    js.executeScript("arguments[0].click()",button);
    Thread.sleep(3000);
	driver.close();
}
}
