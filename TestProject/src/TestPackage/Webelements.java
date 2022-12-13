package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://vita.westus2.cloudapp.azure.com/app/admin/hostDashboard");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']"));
		Username.sendKeys("admin");
		boolean Status = Username.isEnabled();
		System.out.println("Username is enabled " + Status);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).clear();
		WebElement Password = driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']"));
		Password.sendKeys("admin");
		boolean status1 = Password.isDisplayed();
		System.out.println("Password is displayed " +status1);
		String text = Password.getTagName();
		System.out.println("Password Tagname is "+ text);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		Thread.sleep(5000);
		WebElement RememberME = driver.findElement(By.xpath("//span[.=' Remember me ']"));
		boolean Status2 = RememberME.isSelected();
		boolean Status3 = RememberME.isEnabled();
		System.out.println("Remember Password is selected " +Status2);
		System.out.println("Remember Password is enabled "+ Status3);
		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click(); 
		Thread.sleep(5000);
		WebElement location = driver.findElement(By.xpath("(//button[@type=\"button\"])[1]"));
		Point point = location.getLocation();
		System.out.println("X cordinate : " + point.x + " Y cordinate : "+ point.y);
		Thread.sleep(5000);
		driver.close();
	
	}
}
