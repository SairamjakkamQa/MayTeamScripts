package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framess {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");

		WebElement frm = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(frm);

		WebElement drop = driver.findElement(By.id("selectnav1"));

		Select sel = new Select(drop);
		sel.selectByVisibleText("- Testing");
		
		driver.switchTo().defaultContent();
			
		driver.findElement(By.id("name")).sendKeys("Core Java");

	}

}
