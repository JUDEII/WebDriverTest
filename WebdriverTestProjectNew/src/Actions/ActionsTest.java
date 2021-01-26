package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jumia.com.ng/");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES); 

		Actions action = new Actions(driver);
		Thread.sleep(5000);
		WebElement allOptions = driver.findElement(By.xpath("//span[text()='Computing']"));
		//WebElement allOptions = driver.findElement(By.cssSelector(".itm:nth-child(9) > .text"));
		WebElement selectComputerOption = driver.findElement(By.xpath("//a[text()='Laptops']"));
		
		action.moveToElement(allOptions).perform();
		Thread.sleep(2000);
		action.moveToElement(selectComputerOption).click(selectComputerOption).perform();
		Thread.sleep(2000);
//		Action all = action.moveToElement(allOptions).moveToElement(selectComputerOption).build();
		//use .build() whenever you're combining more than one actions. when using build(), you must hold it with an Action class
		//use .perform() when you're carrying out a single action
//		Thread.sleep(2000);
//		all.perform();
		
//		to right click use : .contextClick()
//		to double click use : .doubleClick()
		System.out.println("Success");
		
		
		
	}

}
