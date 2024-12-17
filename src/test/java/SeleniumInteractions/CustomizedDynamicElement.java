package SeleniumInteractions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedDynamicElement {
	
	
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");

	List<WebElement> list=driver.findElements(By.xpath("//ul//li//span[contains(text(), \"java\")]"));
	for (int i = 0; i < list.size()-1; i++) {
		
		  System.out.println(list.get(i).getText());
		  if(list.get(i).getText().equalsIgnoreCase("java compiler"))
		  {
			 list.get(i) .click();
			 driver.navigate().back();
		  }
	}
	
}
}
