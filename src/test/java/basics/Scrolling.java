package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.xpath("//a[text()='open cart          ']"));

		Point loc = element.getLocation();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy"+loc);

	}

}
