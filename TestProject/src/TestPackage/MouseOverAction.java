package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		//driver.findElement(By.xpath("(//span[@class='text'])[23]")).click();
		WebElement MainItem2 = driver.findElement(By.xpath("//a[.='Main Item 2']"));
		actions.moveToElement(MainItem2).perform();
		WebElement SubSubList = driver.findElement(By.xpath("//a[.='SUB SUB LIST »']"));
		actions.moveToElement(SubSubList).perform();
		driver.findElement(By.xpath("//a[.='Sub Sub Item 2']")).click();	
				
	}
}