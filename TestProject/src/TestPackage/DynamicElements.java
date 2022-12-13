package TestPackage;
	import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicElements {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://vita.westus2.cloudapp.azure.com/account/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='userNameOrEmailAddress']")).sendKeys("admin");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123qwe");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		
		//WebElement ele1 = driver.findElement(By.xpath("(//div[@class=\"card-title text-left font-weight-bolder text-dark font-size-h6 mb-4 text-hover-state-dark d-block\"])[1]"));
		//System.out.println("The 1st element is " + ele1.getText());
		
		//WebElement ele2 = driver.findElement(By.xpath("(//div[@class=\"card-title text-left font-weight-bolder text-dark font-size-h6 mb-4 text-hover-state-dark d-block\"])["+i+"]"));
		//System.out.println("The 1st element is " + ele2.getText());
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class=\"card-title text-left font-weight-bolder text-dark font-size-h6 mb-4 text-hover-state-dark d-block\"]"));
		
		int eleLength = ele.size();
		
		for (int i=1; i<=eleLength; i++) {
			WebElement ele1 = driver.findElement(By.xpath("(//div[@class=\"card-title text-left font-weight-bolder text-dark font-size-h6 mb-4 text-hover-state-dark d-block\"])["+i+"]"));
			System.out.println("The 1st element is " + ele1.getText());
		}
		
		
		
	}
}