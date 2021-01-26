package AlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		//to get text from alert
		System.out.println("Alert message is: "+ alert.getText());
		alert.accept(); //to accept alert
		alert.dismiss(); //to cancel or close an alert
		alert.sendKeys("Yes i'm a man"); //to insert text
		
		
	}
}
