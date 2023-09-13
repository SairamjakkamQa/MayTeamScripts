package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNextGeneration {

	@Test (priority = 1)

	public void demotest() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.meesho.com/", url);
		

	}

	@Test(priority = 2,description = "HEllo world iam passed",enabled = false)

	public void ademotest2() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/finance");

	}	
}
