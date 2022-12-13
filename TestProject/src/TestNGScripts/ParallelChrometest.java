package TestNGScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ParallelChrometest {
			public WebDriver driver;
		@BeforeTest
		public void beforeTest() {
			System.out.println("Initilizing the Google Chrome Driver");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		@Test
		public void ChromeTestMethod()
		{
			//Initialize the chrome driver
			System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
			driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
			//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		}
		@AfterTest
		public void afterTest() {
			System.out.println("Closing the browser ");
			// driver.close();
		}
	}

