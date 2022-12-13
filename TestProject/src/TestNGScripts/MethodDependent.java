package TestNGScripts;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MethodDependent {
	
	WebDriver driver;
	

	@Test (dependsOnMethods = { "OpenBrowser" })
    public void Login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }


	@Test
public void OpenBrowser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
	driver.manage().window().maximize();
	  System.out.println("This will execute first (Open Browser)");
}
}





