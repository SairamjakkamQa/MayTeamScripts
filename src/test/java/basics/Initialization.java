package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Initialization {

	@Test

	
	public void test1() {
		
		
		WebDriver driver = new ChromeDriver(); // an instance created named driver

		driver.get("https://mvnrepository.com/");
		
		
	
	}
	

}
