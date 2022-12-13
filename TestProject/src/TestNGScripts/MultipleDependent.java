package TestNGScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleDependent {
	WebDriver driver;
	@Test
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Opening The Browser");
	}

	@Test(dependsOnMethods = { "SignIn", "OpenBrowser" })
	public void LogOut() {
		driver.findElement(By.xpath("//*[@id=\"kt_quick_user_toggle\"]/span[1]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"kt_header\"]/div/div[3]/div/div[2]/div/user-menu/div/div[2]/div[11]/a")).click();
		System.out.println("Logging Out");
	}
	@Test
	public void SignIn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");  
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Signing In");

	}
}

