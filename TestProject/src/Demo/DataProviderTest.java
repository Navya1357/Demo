package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	private static WebDriver driver;
	  @DataProvider(name = "Authentication")
	  public static Object[][] credentials() {
	        // The number of times data is repeated, test will be executed the same no. of times
	        // Here it will execute two times
	        return new Object[][] { { "Admin", "123qwe" }, { "Admin", "123qwe" }};
	  }
	  // Here we are calling the Data Provider object with its Name
	  @Test(dataProvider = "Authentication")
	  public void test(String sUsername, String sPassword) {
		  System.setProperty("webdriver.chrome.driver","C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sUsername);  
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sPassword);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("Signing In");
	     // driver.quit();

	  }
}
