package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Framesi {

	
	@Test
	
	public void frametest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement frm=driver.findElement(By.id("frm1"));
		
		driver.switchTo().frame(frm);
		
		WebElement dropdown=driver.findElement(By.id("course"));
		
		Select sel=new Select(dropdown);
		sel.selectByIndex(1);
		
	}
	
	
}
