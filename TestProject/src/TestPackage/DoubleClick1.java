package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		actions.doubleClick(ele).perform();
		System.out.println("Button is double clicked");
	}
}
		