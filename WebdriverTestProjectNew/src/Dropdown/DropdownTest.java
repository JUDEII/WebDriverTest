package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement month = driver.findElement(By.id("month"));
		Select dateMonth = new Select(month);
		dateMonth.selectByIndex(2); //select by index
		dateMonth.selectByValue("4"); //select by value
		dateMonth.selectByVisibleText("Feb"); //select by visible text
		
	}

}
