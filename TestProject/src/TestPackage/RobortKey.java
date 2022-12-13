package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobortKey {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		Robot name = new Robot();
		Thread.sleep(5000);
		WebElement Newpage = driver.findElement(By.xpath("//span[.='New Page']"));
		Dimension Dimension = driver.manage().window().getSize(); 
		System.out.println(Dimension);
		int x = (Dimension.getWidth()/4)+20; 
		int y = (Dimension.getHeight()/10)+50;
		System.out.println("I am here 1");
		Actions action = new Actions(driver);
		action.contextClick(Newpage).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("I am here 2");
		name.mouseMove(x,y); 
		name.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		System.out.println("I am here 3");
		name.mouseMove(1382, 736);
		System.out.println("I am here 4");
		Thread.sleep(5000);
		name.mousePress(InputEvent.BUTTON1_DOWN_MASK);	
	
	}
  
}
