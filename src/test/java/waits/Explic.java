package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explic {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		//WebDriverWait wait = new WebDriverWait(driver, 15);

//		driver.findElement(By.id("display-other-button")).click(); //10 sec
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
//
//		WebElement element = driver.findElement(By.id("hidden"));
//
//		System.out.println(element.isEnabled());
		
		driver.findElement(By.id("alert")).click();
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
