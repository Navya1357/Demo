package Demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ParallelEdgeTest {
		    public WebDriver driver;
	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Initilizing the edge Driver");
	        System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\msedgedriver.exe");
	        driver = new EdgeDriver();
	    }
	        @Test
	     public void EdgeTestMethod()
	     {
	     //Initialize the chrome driver
	     System.out.println("The thread ID for Edge is "+ Thread.currentThread().getId());
	     driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
	      //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	    }
	     @AfterTest
	     public void afterTest() {
	     System.out.println("Closing the browser ");
	     //driver.close();
	     }


}

