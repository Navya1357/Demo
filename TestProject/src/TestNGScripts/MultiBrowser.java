package TestNGScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {

	WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	
	// Passing Browser parameter from TestNG xml
	public void beforeTest(String browser) {
		// If the browser is edge, then do this
		if(browser.equalsIgnoreCase("edge"))
		{	 
			//Initializing the edge driver (edge)
			System.out.println("i am here >>> 1");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\msedgedriver.exe");
			System.out.println("i am here >>> 11");
			driver = new EdgeDriver();
			System.out.println("i am here >>> 12");
		} else {}
		if (browser.equalsIgnoreCase("chrome")) 
		{ 	  //Initialize the chrome driver
			System.out.println("i am here >>> 2");
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			driver = new ChromeDriver();
		} else {}
		// Enter the website address in the browser
		//System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		System.out.println("i am here >>> 3");
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("i am here >>> 4");
	}
			// Once Before method is completed, Test method will start
	@Test 
	    public void login() throws InterruptedException {
		System.out.println("i am here >>> 5");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("i am here >>> 6");
	}  
	@AfterClass
	    public void afterTest() {
		System.out.println("i am here >>> 7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();

	}
}

