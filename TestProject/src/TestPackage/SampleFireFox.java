package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleFireFox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\TestProject\\Software\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		
	}

}

