package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion1 {

WebDriver driver;
	
	@Test (priority=2)
	public void CloseBrowser() {
		driver.close();
		 Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority=1)
	public void AOpenBrowser() {
		 Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	         Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://www.toolsqa.com");
	        
	         Reporter.log("The website used was toolsqa for this test", true);
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle);
  }
}



