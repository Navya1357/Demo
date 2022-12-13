package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
	WebDriver driver ;
		@Test (priority = 1)
		public void CloseBrowser() {
			driver.close();
			System.out.println("Closing Google Chrome browser");
		}

		@Test (priority = 0)
		public void OpenBrowser() {
			System.out.println("Launching Google Chrome browser"); 			
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		}
		
  }

