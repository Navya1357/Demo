package TestNGScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnGroups {
	
	//System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver;
	
	//Saving the expected title of the Webpage
	String title = "vita";


	@Test(groups= {"Demo1"}) 
	public void aastarting_point(){
		System.out.println("This is the starting point of the test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();


	}
	@Test(groups = {"Demo1"})
	public void aexecute()
	{
		System.out.println("This is the starting point of the test2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("This is the starting point of the test3");
		
	}


	@Test(groups = { "Demo2" })	
	public void checkTitle() {	
		System.out.println("This is the starting point of the test4");
		String Title = "vita";
		String originalTitle = driver.getTitle();
	AssertJUnit.assertEquals(originalTitle, Title);
	System.out.println("This is the starting point of the test5");
		
	}	


	@Test(groups = { "Demo2"})	
	public void click_element() throws InterruptedException {
		System.out.println("This is the starting point of the test6");
		Thread.sleep(5000);
				WebElement ele = driver.findElement(By.xpath("/html/body/app-root/ng-component/div/default-layout/div/div/div[2]/div[2]/ng-component/customizable-dashboard/div/div[1]/sub-header/div/div/div[2]/div/label/span"));
				Thread.sleep(5000);
				ele.click();
		//driver.findElement(By.xpath("(//a[@class='menu-link px-5'])[8]")).click();
		System.out.println("Home Page heading is displayed");	
	}
}


