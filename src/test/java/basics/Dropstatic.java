package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropstatic {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drop=driver.findElement(By.id("countr"));
		
		Select sel=new Select(drop);
		
		//sel.selectByVisibleText("China");
		//sel.selectByIndex(2);
		sel.selectByValue("germany");
	}

}
