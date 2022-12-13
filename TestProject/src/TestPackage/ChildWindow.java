package TestPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://vita.westus2.cloudapp.azure.com";
		driver.get(url);
		Thread.sleep(5000);        
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	    Thread.sleep(10000);
		driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])[17]")).click();	
		String MainWindow = driver.getWindowHandle();
		System.out.println("Main window handle is " + MainWindow);
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> iterator = allwindows.iterator();
		while(iterator.hasNext())
		{
			String childbrowser = iterator.next();
			if(MainWindow.equalsIgnoreCase(childbrowser))
			{
				driver.switchTo().window(childbrowser);
			    driver.findElement(By.xpath("//span[.='File Upload']")).click();
				WebElement text = driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])[18]"));
				text.click();
				System.out.println("Heading of child window is " + text.getTagName());
				
			}
		}
		
	}	
	}

		
		
		