package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo {



	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	         System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
	            
	            // Initialize browser
	            WebDriver driver=new ChromeDriver();
	            driver.manage().window().maximize();
	            
	            // Initialize browser
	            driver.get("https://demoqa.com/nestedframes");
	            WebElement pageHeadingElement= driver.findElement(By.xpath("//div[@class='main-header']"));
	            String pageHeading = pageHeadingElement.getText();
	            System.out.println("The Page Heading is:" +pageHeading);
	            
	            
	            
	            //Switch to parent frame
	            WebElement frame1= driver.findElement(By.id("frame1"));
	            driver.switchTo().frame(frame1);
	            WebElement frame1Element= driver.findElement(By.tagName("body"));
	            String frame1Text=frame1Element.getText();
	            System.out.println("Frame1 is :"+frame1Text);
	            
	            //Switch to child frame
	            driver.switchTo().frame(0);
	            WebElement frame2Element= driver.findElement(By.tagName("p"));
	            String frame2Text=frame2Element.getText();
	            System.out.println("Frame2 is :"+frame2Text);



	           //Switch to default content
	            driver.switchTo().defaultContent();



	           //Try to print the heading of the main page without swithcing
	            WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
	            System.out.println(mainPageText.getText());
	            
	            
	            int totalIFramesOnPage=driver.findElements(By.tagName("iframe")).size();
	            
	            //Print the total iframes on page
	            System.out.println("Total iframes on Page:"+totalIFramesOnPage);
	            
	            //switch to first frame using index=0
	            driver.switchTo().frame(0);
	           
	        }
	            
	            
	    }