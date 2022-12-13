package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//input[@type='text']"))));
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
    wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//span[.='Configuration']"))));
	driver.findElement(By.xpath("//span[.='Configuration']")).click();
	driver.findElement(By.xpath("//span[.='Customers']")).click();
}
}
