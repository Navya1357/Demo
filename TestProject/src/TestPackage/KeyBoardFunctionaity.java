package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardFunctionaity {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		WebElement FN = driver.findElement(By.id("userName"));
		FN.sendKeys("abc");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abc123@gmail.com");
		WebElement add = driver.findElement(By.id("currentAddress"));
		add.sendKeys("43 School Lane London EC71 9GO");
		
		// Select the Current Address using CTRL + A
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("A");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		  // Copy the Current Address using CTRL + C
        action.keyDown(Keys.CONTROL);
        action.sendKeys("C");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        
      //Press the TAB Key to Switch Focus to Permanent Address
        action.sendKeys(Keys.TAB);
        action.build().perform();
        
        //Paste the Address in the Permanent Address field using CTRL + V
        action.keyDown(Keys.CONTROL);
        action.sendKeys("V");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
             
        
}
}