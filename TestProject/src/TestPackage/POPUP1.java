package TestPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//button[.='Click me'])[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",element);
		Alert ele = driver.switchTo().alert();
		System.out.println(ele.getText());
		System.out.println("Hii");		
		ele.sendKeys("abc");
		System.out.println("Hello");	
		Thread.sleep(5000);
		ele.accept();
		//driver.quit();
	}

	
}
