package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("(//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'])[1]"));
		WebElement dst = driver.findElement(By.xpath("(//div[@class='drop-box ui-droppable'])[1]"));
		actions.dragAndDrop(src, dst).perform();
		String totext = dst.getText();
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
	

