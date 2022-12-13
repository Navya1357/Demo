package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();    
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 Thread.sleep(5000);		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='menu-title ng-star-inserted'])[4]")));
		System.out.println("I am here 1");
		WebElement ele =driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])[4]"));
		System.out.println("I am here 2");
		ele.click();
		
		driver.findElement(By.xpath("//span[.='Credit Note']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"StartEndRange\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/bs-daterangepicker-container/div/div/div/div/bs-days-calendar-view[1]/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[5]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"kt_body\"]/bs-daterangepicker-container/div/div/div/div/bs-days-calendar-view[2]/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[3]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Search']")).click();
	}

}

