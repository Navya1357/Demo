package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Dell/OneDrive%20-%20Abylle%20Solutions%20Pvt%20Ltd/Desktop/gg.html");
		WebElement ele = driver.findElement(By.id("select menu bar"));
		Select name = new Select(ele);
		List<WebElement> GetOption = name.getOptions();
		for(WebElement Opt:GetOption)
		{
			System.out.println(Opt.getText());
		}
		name.selectByIndex(2);
		System.out.println("Select the value is " + name.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		name.selectByVisibleText("Fried Rice");
		Thread.sleep(5000);
        name.selectByValue("4");
        System.out.println("Select By value is " + name.getFirstSelectedOption().getText());
        driver.quit();
	}

}
