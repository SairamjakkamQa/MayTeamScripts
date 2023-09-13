package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstractmethods {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mvnrepository.com/");

		driver.findElement(By.partialLinkText("Catego")).click();

//	List<WebElement>tags=driver.findElements(By.tagName("a"));
//	
//	System.out.println(tags.size());
//	
//	
//	
//	for(WebElement tag:tags) {
//		
//		System.out.println(tag.getText());
//		
//		
//	}

		Thread.sleep(3000);

		driver.close();
	}

}
