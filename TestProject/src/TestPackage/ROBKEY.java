package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ROBKEY {
	public static void main(String[] args) throws AWTException, InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");  
		 
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		// Create object of Robot class
		Robot robot = new Robot();
		 
		// Scroll MouseWheel
		robot.mouseWheel(5);
}
}
