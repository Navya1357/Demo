package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://vita.westus2.cloudapp.azure.com";
		driver.get(url);
		Thread.sleep(5000);        
		driver.manage().window().maximize();		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[.='Got it!']")).click();		
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//div[@class='pb-lg-0 pb-5 ng-tns-c253-1']")).click();
		String ele = driver.getTitle();
		System.out.println(ele);
		String pagesource = driver.getPageSource();
		int pagesourcelength= pagesource.length();	
		System.out.println(pagesourcelength);
		String actualurl=driver.getCurrentUrl();
		if (actualurl.equals(url))
		{ System.out.println("Verification is sucessfully-the correct url is opend");
		}
		else {
			System.out.println("Verification is failed-an incorrect url is opend");
			System.out.println("actul url is " + actualurl);
			System.out.println("expected url is " + url);	    
		}

		

	}
}