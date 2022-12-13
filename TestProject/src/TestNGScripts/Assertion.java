package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver= new ChromeDriver();

	@Test (priority = 0)
    public void CloseBrowser() {
        driver.close();
        Reporter.log("Driver Closed After Testing");
    }
    
    @Test (priority = -1)
    public void OpenBrowser() {
        Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
            Reporter.log("Launching Google Chrome Driver version 81 for this test");
            
            driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
            
            Reporter.log("The website used was vita for this test", true);
            String expectedTitle = "vita";
            String originalTitle = driver.getTitle();
            Assert.assertEquals(originalTitle, expectedTitle);
    }
}





