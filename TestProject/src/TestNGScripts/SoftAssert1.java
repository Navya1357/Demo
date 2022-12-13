package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
 
	  WebDriver driver;
		
		@Test (priority = 0)
		public void CloseBrowser() {
			driver.close();
			 Reporter.log("Driver Closed After Testing");
		}
		
		@Test (priority = -1)
		public void OpenBrowser() {
				Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
		         Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
		        System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		        driver=new ChromeDriver();
		        driver.get("https://www.oracle.com");
		        SoftAssert softassert = new SoftAssert();
		         Reporter.log("The website used was Oracle for this test", true);
		        String expectedTitle = "Oracle | Cloud Applications and Cloud Platform";
		        String originalTitle = driver.getTitle();
		        softassert.assertEquals(originalTitle, expectedTitle);
		        System.out.println("*** Checking For The Second Title ***");
		        Reporter.log("Checking title for Oracle – Oracle Website to Practice Automation");
		        softassert.assertEquals(originalTitle, "Oracle | Cloud Applications and Cloud Platform" );
		        softassert.assertAll();
	  }
  }


