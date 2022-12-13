package HubAndNode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample1 {
	public static WebDriver driver;

	public static void main(String[]  args) throws MalformedURLException, InterruptedException{
		//DesiredCapabilities dc=new DesiredCapabilities();
	//	dc.setCapability("browserName","chrome");
		ChromeOptions chromeoption=new ChromeOptions();
		chromeoption.setCapability("browserName", "chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),chromeoption);
		driver.manage().window().maximize();
		driver.get("http://vita.westus2.cloudapp.azure.com/app/admin/tenants");
		System.out.println(driver.getTitle());
		//driver.quit();
		
	}		
}

