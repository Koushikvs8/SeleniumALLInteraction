package SeleniumInteractions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	 WebDriver  driver;
		@Test
		public void frameSwich() throws InterruptedException, IOException
		{
			     driver=new ChromeDriver();
			     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     driver.manage().window().maximize();
			     driver.get("https://testautomationpractice.blogspot.com/");
			     String linkUrl;
				URL url = new URL(linkUrl);
		            HttpURLConnection http = (HttpURLConnection) url.openConnection();
		            http.setRequestMethod("GET");
		            http.connect();
		}    
	
	
	
}
