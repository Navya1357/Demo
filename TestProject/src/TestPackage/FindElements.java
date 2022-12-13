package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/app/admin/hostDashboard");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		List<WebElement> allInputs = driver.findElements(By.xpath("//span[@class='menu-title ng-star-inserted']"));
		if(allInputs.size()!=0)
		{
			System.out.println(allInputs.size() + " Elements found by TagName as span \n");
			Thread.sleep(5000);			
			for(WebElement allInputsElements : allInputs)
			{
                System.out.println(allInputsElements.getText());
				
			}			
		}
	}
}



		
		
		