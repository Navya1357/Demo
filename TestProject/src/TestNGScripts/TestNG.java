package TestNGScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class TestNG {
    WebDriver driver ;
    public void Login() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   String testTitle = "vita";
	   String originalTitle = driver.getTitle();
	   AssertJUnit.assertEquals(originalTitle, testTitle);
      }
	
   @BeforeMethod
    public void beforeMethod() {
	   System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println("Starting Test On Chrome Browser");
    }
	
    @AfterMethod
     public void afterMethod() {
	 driver.close();
	 System.out.println("Finished Test On Chrome Browser");
    }
}
