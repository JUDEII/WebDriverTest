import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
//		driver.navigate().back(); //this goes back to previous page
//		driver.navigate().forward(); //this navigates forward
//		driver.navigate().refresh(); //this refreshes the page
//		
//		driver.close(); //this closes only the current window
//		driver.quit(); //this closes the entire browser
		
		//to use cssSelector
		//html tagName[attributeName='value']
		
		//to use relative xpath
		//html tagName[@attributeName='value']
		
		WebElement searchField = driver.findElement(By.name("q"));
		//WebElement searchField = driver.findElement(By.className("gLFyf.gsfi"));
		searchField.click();
		searchField.sendKeys("Bye Bye");
		
		WebElement btn = driver.findElement(By.className("gNO89b"));
		Dimension size = btn.getSize();
		System.out.println("Height is: "+size.getHeight() + ", Width is: "+size.getWidth());
		
		Point p=btn.getLocation();
		System.out.println("X and Y axis location: "+ p.getX()+", "+p.getY());
	}

}
