package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
	public static void main(String[] args) throws InterruptedException {


		

		String baseUrl = "http://demo.guru99.com/test/tooltip.html";                    
		System.setProperty("webdriver.chrome.driver","C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();            
		driver.manage().window().maximize();                
		String expectedTooltip = "What's new in 3.2";                    
		driver.get(baseUrl);                    

		WebElement download = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/a"));        
		Thread.sleep(4000);
		Actions builder = new Actions (driver);                            



		//builder.clickAndHold().moveToElement(download);
		builder.moveToElement(download).perform();
		Thread.sleep(4000);


		WebElement toolTipElement = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/a"));
		Thread.sleep(4000);
		String actualTooltip = toolTipElement.getText();            

		System.out.println("Actual Title of Tool Tip  "+actualTooltip);    
		Thread.sleep(4000);
		if(actualTooltip.equals(expectedTooltip)) {                            
			System.out.println("Test Case Passed");                    
		}        
		//driver.close();            
	}        


}


