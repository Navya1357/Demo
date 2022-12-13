package TestPackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class New {
	public static void main(String[] args) throws InterruptedException 
	{	 FirefoxDriver driver = new FirefoxDriver();    
		System.setProperty("webdriver.gecko.driver","./Software/geckoderiver.exe");
	
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
}
}
