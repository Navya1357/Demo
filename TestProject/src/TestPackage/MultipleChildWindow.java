package TestPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleChildWindow {
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
		driver.findElement(By.xpath("//span[.='File Upload']")).click();
		driver.findElement(By.xpath("//span[.='Batch Information']")).click();
		//driver.findElement(By.xpath("//span[.='Credit Note Upload']")).click();
		String MainWindow = driver.getWindowHandle();
		System.out.println("Main window handle is " + MainWindow);

		
		// To handle all new opened window
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("Child window handle is" + s1);
		System.out.println("I am here 1");
		Iterator<String> i1 = s1.iterator();
		// Here we will check if child window has other child windows and when child window
		//is the main window it will come out of loop.
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			System.out.println("I am here 2");
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				System.out.println("I am here 4");
				driver.close();
				System.out.println("Child window closed");
				System.out.println("I am here 5");
			}
			else {
				System.out.println("nop");
			}
		}	


	}
}