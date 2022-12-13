package TestPackage;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement1 {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
	List<WebElement> ele = driver.findElements(By.xpath("//span[@class='menu-title ng-star-inserted']"));
		
		int eleLength = ele.size();
		
		for (int i=1; i<=eleLength; i++)
		{
			WebElement ele1 = driver.findElement(By.xpath("(//span[@class='menu-title ng-star-inserted'])["+i+"]"));
			System.out.println("The 1st element is " + ele1.getText());
		}
	}	
		
}



