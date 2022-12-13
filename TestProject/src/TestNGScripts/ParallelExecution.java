package TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
    @Test
     public void Edge() {     
   //Initializing the edge driver (edge)
        System.out.println("The thread ID for edge is "+ Thread.currentThread().getId());
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\msedgedriver.exe");
         driver = new EdgeDriver();      
         driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
         //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        // driver.quit();



    }
    
    @Test
    public void ChromeTest()
    {
          //Initialize the chrome driver
          System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
         // driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
          //driver.quit();
    }
}



