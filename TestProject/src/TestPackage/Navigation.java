package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://vita.westus2.cloudapp.azure.com";
		driver.navigate().to(url);
		Thread.sleep(5000);        
		driver.manage().window().maximize();		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[.='Got it!']")).click();		
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//div[@class='pb-lg-0 pb-5 ng-tns-c253-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Tenants'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])[3]")).click();	
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-tns-c255-16 ng-star-inserted']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}
}
