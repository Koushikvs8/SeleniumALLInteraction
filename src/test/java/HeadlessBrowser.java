import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowser {
WebDriver driver;
	
	@Test
void Scrolling_Page() throws InterruptedException


{   
		///////////////////////// For headless /////////////
		ChromeOptions options= new ChromeOptions();
options.addArguments("--headless");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
///////////////////////////////
		driver=new ChromeDriver(options);
    driver.get("https://live.techpanda.org/index.php/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    WebElement element=driver.findElement(By.xpath("//address[@class='copyright']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);", element);
    Thread.sleep(3000);
    System.out.println("Successfull");
	driver.close();
}
}
