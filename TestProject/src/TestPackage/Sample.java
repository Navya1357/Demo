package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://vita.westus2.cloudapp.azure.com";
		driver.get(url);
		Thread.sleep(5000);        
		driver.manage().window().maximize();		
		Thread.sleep(5000);				
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pb-lg-0 pb-5 ng-tns-c253-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Tenants'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])[3]")).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-tns-c255-16 ng-star-inserted']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='TenancyName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("xyz");		
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("pqr");
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("Rao");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abcd@gmil.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='CreateTenant_SetRandomPassword']")).click();
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("qwe");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("asd");
		 WebElement ele = driver.findElement(By.xpath("//select[@name='edition']"));
		 Select Sc=new Select(ele);
		 Sc.selectByVisibleText("Not assigned");
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("(//button[.=' Cancel '])[1]")).click();
				}
	}



