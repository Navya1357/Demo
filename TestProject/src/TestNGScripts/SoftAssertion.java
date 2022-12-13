package TestNGScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertion {
	WebDriver driver;
	@Test (priority = 0)
	public void OpenBrowser() {
		System.out.println("Launching Google Chrome browser"); 			
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
	}
	@Test (priority = 1)
	public void login()
	{
		System.out.println("This is the starting point of the test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Home page is displayed");
	}
		@Test (priority = 2)
		public void Compare() {	
		SoftAssert soft = new SoftAssert();
		String title="vita";
		String Expected = driver.getTitle();
		soft.assertEquals(title, Expected);
		soft.assertAll();
	}

	@Test (priority = 3)
	public void CloseBrowser()
	{
		driver.close();
	}
}


