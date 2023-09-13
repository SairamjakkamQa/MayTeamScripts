package testNgg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotationss {

	WebDriver driver;

	@BeforeMethod

	public void setup() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@Test(description = "Login finctionality validation")

	public void logintest() {

		driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");

		driver.findElement(By.name("pword")).sendKeys("1234");

		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();

	}

	@Test
	public void urltest() {

		WebElement mail = driver.findElement(By.name("emailid"));
		mail.click();
		mail.sendKeys("pooja132@gmail.com");
		driver.findElement(By.name("pword")).sendKeys("1234");

		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String urls = driver.getCurrentUrl();
		Assert.assertEquals("http://poojastore.marolix.com/Admin/Dashboard", urls);
	}

	@AfterTest

	public void teardown() {

		 driver.close();

	}
}
