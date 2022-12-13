package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random {
	public static void main(String[] args) throws AWTException, InterruptedException {
			
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Robot r = new Robot();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ALT);
	 Thread.sleep(1500);
	r.keyPress(KeyEvent.VK_SPACE);
	 Thread.sleep(1500);
	r.keyPress(KeyEvent.VK_N);
	 Thread.sleep(1500);
	r.keyRelease(KeyEvent.VK_ALT);
	 Thread.sleep(1500);
    r.keyRelease(KeyEvent.VK_SPACE);
    Thread.sleep(1500);
    r.keyRelease(KeyEvent.VK_N);
}
}