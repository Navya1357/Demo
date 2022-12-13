package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion2 {
WebDriver driver;
	
	@Test (priority=1)
	public void AOpenBrowser() {
		
	        System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://www.oracle.com");	        
	        String expectedTitle = "Oracle | Cloud Applications and Cloud Platform";
	        String originalTitle = driver.getTitle();
	        try {
	        Assert.assertEquals(originalTitle, expectedTitle);
	        } catch(Exception e) {}
	        Reporter.log("Home page2 is displayed");
  }
	
	@Test (priority=2)
	public void CloseBrowser() {
		driver.close();
	}
}


