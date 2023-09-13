package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String parentwindow = driver.getWindowHandle();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> ids = driver.getWindowHandles();
		for (String Windowids : ids) {
			System.out.println(Windowids);
			if (!parentwindow.equals(Windowids)) {
				driver.switchTo().window(Windowids);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Washington sundar");
			}
		}		
		Thread.sleep(4000);
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("Virat Kohli");
	}
}
