package HubAndNode;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Sample {

	public static WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setUp() throws MalformedURLException {
    	ChromeOptions chromeoption=new ChromeOptions();
		chromeoption.setCapability("browserName", "chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),chromeoption);
		driver.manage().window().maximize();
		driver.get("http://vita.westus2.cloudapp.azure.com/app/admin/tenants");
    }

    @AfterTest
    public void TafterTest() {
        driver.quit();
    }
    @Test
    public void sampleTest() {
     	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
                 if (driver.getPageSource().contains("MOBILE TESTING")) {
            Assert.assertTrue(true, "Mobile Testing Link Found");
        } else {
            Assert.assertTrue(false, "Failed: Link not found");
        }

    }

}


