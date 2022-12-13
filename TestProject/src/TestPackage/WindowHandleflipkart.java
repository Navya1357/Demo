package TestPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleflipkart {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com";
		driver.get(url);
		Thread.sleep(5000);        
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[7]")).click();
		//System.out.println("I am here 1");
		/* JavascriptExecutor js = (JavascriptExecutor)driver;
		 for(int i=1; i>=3; i++) {
			 js.executeScript("window.scrollbar(0,100)");
		 }*/
		Thread.sleep(2000);
		// Opening all the child window
        driver.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[8]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='SONY Bravia 125.7 cm (50 inch) Ultra HD (4K) LED Smart Google TV']")).click();
        Thread.sleep(5000);
         String MainWindow = driver.getWindowHandle();
        System.out.println("Main window handle is " + MainWindow);
        // To handle all new opened window
       Set<String> s1 = driver.getWindowHandles();
       int slength = s1.size();
       System.out.println("Child window handle is" + s1);
       System.out.println("Child window handle size is" + slength);
       Iterator<String> i1 = s1.iterator();
       
       
    // Here we will check if child window has other child windows and when child window
       //is the main window it will come out of loop.
       while (i1.hasNext()) {
           String ChildWindow = i1.next();
           System.out.println("The Child window ID is >>>>>> " + ChildWindow );
           if (!MainWindow.equalsIgnoreCase(ChildWindow))
        	   {
        	   Thread.sleep(5000);
               driver.switchTo().window(ChildWindow);
               System.out.println("I am inside Child window");
               driver.close(); 
               // break;
            }
        }
	   driver.switchTo().window(MainWindow);
	   System.out.println("I am back to Main window");
      // driver.quit(); 
	   } 
       
       
	}
	
	
	

	
	
