package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//this line means the test will wait for 30secs, if the page does not load after 2 mins, it will quit
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES); 
		
		//Implicit wait tells driver.findElement to wait a max of x-secs 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.click();
		searchField.sendKeys("Bye Bye");
		searchField.sendKeys(Keys.ENTER);
//		WebElement btn = driver.findElement(By.className("gNO89b"));
//		btn.click();
		
//		Thread.sleep(5000);
//		WebElement selectOption = driver.findElement(By.linkText("Bye-bye | Definition of Bye-bye by Merriam-Webster"));
//		Point point = selectOption.getLocation();
//		System.out.println("X and Y axis location: "+ point.getX()+", "+point.getY());
//
//		int xCord = point.getX();
//		int yCord = point.getY();
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(selectOption, xCord, yCord);
//		
//		selectOption.click();
		
		
		Thread.sleep(5000);
		
//		// This  will scroll down the page by  1000 pixel vertical		
		js.executeScript("window.scrollBy(0,2000)");
		
//		WebElement scroller = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div[7]/div[2]/div[1]/a/h3/span"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroller);
				
		Thread.sleep(3000);

		//WebElement selectOption = driver.findElement(By.cssSelector(".g:nth-child(9) .LC20lb > span"));
		WebElement selectOption = driver.findElement(By.xpath("(//*[text()='Bye-bye | Definition of Bye-bye by Merriam-Webster'])"));

		selectOption.click();
		
		Thread.sleep(3000);
		
		//explicit wait tells webdriver to wait for a max of x-secs until a certain condition is met 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("pugilism")));
		System.out.println("successfully waited");
		
		//WebElement games = driver.findElement(By.xpath("(//a[text()='GAMES'])[1]"));
		WebElement games = driver.findElement(By.linkText("GAMES"));

		games.click();
		
		System.out.println("success");
		
	}

}
