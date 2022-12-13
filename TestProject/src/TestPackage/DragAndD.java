package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndD {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(src, dst).perform();
		String totext = dst.getText();
		System.out.println(totext);
		if (totext.equals("Dropped!"))
		{
			System.out.println("PASS: Source is dropped to target as expected");
		}
		else
		{
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	
			
		}
	}
	


