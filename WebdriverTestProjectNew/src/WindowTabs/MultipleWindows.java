package WindowTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude.ibegbulam\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement signUp = driver.findElement(By.id("u_0_2"));
		signUp.click();
		Thread.sleep(3000);
		WebElement terms = driver.findElement(By.id("terms-link"));
		terms.click();
		
		//to switch from parent tab to child tab
		
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> transfer = allWindow.iterator();
		while (transfer.hasNext()) {
			String childWindow = transfer.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				WebElement btn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']"));
				btn.click();
				Thread.sleep(3000);
				
				//to switch back to parent window
				//driver.switchTo().window(mainWindow);
				
				//to switch to grandChild window
				WebElement terms2 = driver.findElement(By.id("terms-link"));
				terms2.click();
				Thread.sleep(3000);
				Set<String> allWindow2 = driver.getWindowHandles();
				Iterator<String> transfer2 = allWindow.iterator();
				while (transfer2.hasNext()) {
					String grandchild = transfer2.next();
					if(!grandchild.equals(mainWindow) && !grandchild.equals(childWindow)) {
						driver.switchTo().window(grandchild);
					}
				}

			}
		}
	}

}
