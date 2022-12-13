package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMouseAction {
	public static void main(String[] args) throws AWTException {		
	
	 System.setProperty("webdriver.chrome.driver","C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");  
        
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
      
     driver.get("https://www.amazon.com");
      
     // Create object of Robot class
     Robot robot = new Robot();
      
     // Scroll MouseWheel
     robot.mouseWheel(13);
     System.out.println("Mouse is scroll down");
}
}

