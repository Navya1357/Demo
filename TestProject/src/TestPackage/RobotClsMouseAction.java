package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClsMouseAction {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		 
	WebDriver driver = new ChromeDriver();    
     driver.manage().window().maximize();    
     driver.get("https://www.toolsqa.com/selenium-webdriver/robot-class-mouse-events/"); // sample url    
     Thread.sleep(3000);
     Robot robot = new Robot();    
     robot.mouseMove(850, 400); // move mouse point to specific location
     robot.mouseMove(950, 500);
     
     
    /* Dimension dimension = driver.manage().window().getSize();
     System.out.println("Dimension");
     //3. Get the height and width of the screen
     int x = (dimension.getWidth()/4)+20;
     int y = (dimension.getHeight()/10)+50;*/
          
     robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step    
     robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click    
     Thread.sleep(5000);
     robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button    
     Thread.sleep(2000);    
     robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click    
     robot.delay(3500);    
     robot.keyPress(KeyEvent.VK_ENTER);    
     // press enter key of keyboard to perform above selected action    
    // System.out.println("done");
 }    

}

