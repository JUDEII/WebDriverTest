package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotTest {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.out.println("Start Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		getScreenshot("google screen");
		
		System.out.println("Success screenshot");
	}
	
	public static void getScreenshot(String filename) throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcfile = screenshot.getScreenshotAs(OutputType.FILE);
		Files.copy(srcfile, new File("C:\\Users\\jude.ibegbulam\\eclipse-projects\\WebdriverTestProject\\src\\screenshotImage\\"+filename+".jpg"));
	}
}
