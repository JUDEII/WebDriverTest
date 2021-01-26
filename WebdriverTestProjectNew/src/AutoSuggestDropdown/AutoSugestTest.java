package AutoSuggestDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions= driver.findElements(By.xpath("//*[contains(text(), 'selenium')]"));
		int size = allOptions.size();
		System.out.println("Size of webelements is "+size);
		for (int i = 0; i < size; i++) {
			String txt = allOptions.get(i).getText();
			System.out.println(txt);
		}

		
	}

}
