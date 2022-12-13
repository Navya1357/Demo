package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		Thread.sleep(60000);
		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		actions.moveToElement(slider, 50, 0).perform();
		slider.click();
	    System.out.println("Moved slider in horizontal directions");
	   // driver.close();
	}
}
