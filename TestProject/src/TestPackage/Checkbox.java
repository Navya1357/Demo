package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.=' Create new tenant ']")).click();
		Thread.sleep(5000);
		System.out.println("i am here 1");
		WebElement UserHostDatabase = driver.findElement(By.xpath("//input[@id=\"CreateTenant_UseHostDb\"]"));
		System.out.println("i am here 2");
		boolean IsSelected = UserHostDatabase.isSelected();
		System.out.println("i am here 3");
		if (IsSelected==true)
		{
			System.out.println("i am here 4");
			Thread.sleep(5000);
			UserHostDatabase.click();
			System.out.println("i am here 5");
			Thread.sleep(5000);
			UserHostDatabase.click();
		} else {
			System.out.println("i am here 6");
		}
		System.out.println("i am here 7");
		WebElement SetRandomPassword = driver.findElement(By.xpath("//input[@id='CreateTenant_SetRandomPassword']"));
		System.out.println("i am here 8");
		boolean IsDisplayed = SetRandomPassword.isDisplayed();
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	 js executeScript("window.scrollBy(0,50000)");
		if(IsDisplayed==true)
		{
			System.out.println("i am here 9");
			Thread.sleep(5000);
			SetRandomPassword.click();
			Thread.sleep(5000);
			System.out.println("i am here 10");
		}
	}
}

