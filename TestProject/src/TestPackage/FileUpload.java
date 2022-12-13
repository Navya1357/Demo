package TestPackage;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Navya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize(); //always write wait code after this
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); //for page load
		d.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)d; //Scrolling using JavascriptExecutor
		js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		Thread.sleep(3000);

		// FILE UPLOADING USING SENDKEYS ....

		WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
		//click on ‘Choose file’ to upload the desired file
		browse.sendKeys("C:\\Users\\Admin\\Downloads\\How to setup a hub and node.docx"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");

	}
}