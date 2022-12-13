package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
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
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='File Upload']")).click();		
		WebElement text = driver.findElement(By.xpath("//span[.='Batch Information']"));
		System.out.println("Element found using text: " + text.getText());
		
		
		
	}
}