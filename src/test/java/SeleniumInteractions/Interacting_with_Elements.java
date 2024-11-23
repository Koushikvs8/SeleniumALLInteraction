package SeleniumInteractions;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.Duplication;

public class Interacting_with_Elements {
	static WebDriver driver ;
	@Test
	void Interaction_element() throws InterruptedException
	{    driver=new ChromeDriver();
		driver.get("https://ultimateqa.com/complicated-page");
		driver.get("https://ultimateqa.com/complicated-page");
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		////clicking the element
		System.out.println(driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']")).getAttribute("class"));
		boolean status= driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']")).isDisplayed();
		System.out.println(status);
		///// sending the keys for inputfield
		List <WebElement> elements= driver.findElements(By.xpath("//div[@class='et_pb_row et_pb_row_2 et_pb_row_4col']/div/div"));
		for(WebElement E:elements)
		{
			Actions actions = new Actions(driver);

	        // Perform the mouse hover action
	        actions.moveToElement(E).perform();
	        Thread.sleep(1000);
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='et_pb_contact_name_0']")).sendKeys("koushik");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='et_pb_contact_email_0']")).sendKeys("Koushik123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='et_pb_contact_message_0']")).sendKeys("Please hire me as early as possible");
		Thread.sleep(1000);
		
	   driver.close();
		
	}

}
