package Demo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Groupdepenent {
  
  WebDriver driver;
  
		@Test(groups= {"Block"}) 
		public void aastarting_point() throws InterruptedException{
			 System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			 driver.get("http://vita.westus2.cloudapp.azure.com/account/login");		  
			Thread.sleep(4000);
			driver.manage().window().maximize();
			System.out.println("This is the starting point of the test");
			
		}
		@Test(dependsOnGroups = { "Block" })
		public void login()
		{
			System.out.println("This is the starting point of the test2");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("Home page is displayed");
			
  }
}
