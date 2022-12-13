package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/Dell/OneDrive%20-%20Abylle%20Solutions%20Pvt%20Ltd/Desktop/Multiple.html");
	WebElement dropdown = driver.findElement(By.id("food"));
	Select ele = new Select(dropdown);
	List<WebElement> Opt = ele.getOptions();
	for(WebElement allopt:Opt) {
		String Disp = allopt.getText();
		System.out.println(Disp);
	}	
	if(ele.isMultiple())
	{
		 ele.selectByValue("0");
		//	System.out.println(ele.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		ele.selectByIndex(4);
		//System.out.println(ele.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		ele.selectByVisibleText("Palav");
		Thread.sleep(2000);
		ele.deselectByVisibleText("Biriyani");
		Thread.sleep(2000);
		ele.deselectAll();
		}
}
}
