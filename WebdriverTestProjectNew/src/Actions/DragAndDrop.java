package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jumia.com.ng/");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES); 
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		
		//drag and drop
//		WebElement source = driver.findElement(By.xpath("//span[text()='Jumia Food']"));
//		WebElement target = driver.findElement(By.xpath("//input[@id='fi-q'][@type='text']"));
//		Thread.sleep(2000);
//		action.dragAndDrop(source, target).perform();
		
		//using keyboard arrows to select an option
		WebElement searchField = driver.findElement(By.id("fi-q"));
		searchField.sendKeys("phones");
		Thread.sleep(2000);
		Action pickOption = action.sendKeys(searchField, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		pickOption.perform();
		
//		Thread.sleep(2000);
//		WebElement clickSearchBtn = driver.findElement(By.xpath("//button[text()='Search']"));
//		clickSearchBtn.click();
//		
		System.out.println("Success");
	}

}
