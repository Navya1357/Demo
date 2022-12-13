package TestPackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.get("http://vita.westus2.cloudapp.azure.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");			
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
	driver.findElement(By.xpath("//div[@class='pb-lg-0 pb-5 ng-tns-c253-1']")).click();
	//driver.close()	;
	}

}

