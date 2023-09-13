package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disbled {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.querySelector(\"input[placeholder='Enter Last name']\").disabled=false");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Last nam\"]")).sendKeys("hello");

	}

}
