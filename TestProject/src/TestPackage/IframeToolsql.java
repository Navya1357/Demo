package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeToolsql {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();		
		JavascriptExecutor exe= (JavascriptExecutor) driver;
		int numberofFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberofFrames);
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		driver.switchTo().frame("frame1");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.id("sampleHeading"));
		String xyz = ele.getText();
		ele.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		System.out.println(xyz);
		//driver.quit();

		
	}
}
