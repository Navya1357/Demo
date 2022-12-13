package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardFun {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.id("email"));
		WebElement PW = driver.findElement(By.id("passwd"));	
		Actions action=new Actions(driver);
		action.keyDown(UN,Keys.SHIFT);
		action.sendKeys("hey");
		action.keyUp(UN,Keys.SHIFT);
		action.build().perform();
		
		action.keyDown(PW,Keys.SHIFT);
		action.sendKeys("qwe");
		action.keyUp(PW,Keys.SHIFT);
		action.build().perform();
	
		/*action.keyDown(UN,Keys.CONTROL);
		action.sendKeys("A");
		action.keyDown(UN,Keys.CONTROL);
		action.sendKeys("C");
		action.keyDown(PW,Keys.CONTROL);
		action.sendKeys("V");*/
	}
}