package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("//i[@class='flaticon-chat-2 fs-4']"));
		actions.contextClick(ele).perform();
	}

}
