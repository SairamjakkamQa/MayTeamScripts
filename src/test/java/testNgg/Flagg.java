package testNgg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flagg {

	WebDriver driver;

	@BeforeMethod

	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin.hospiol.com/site/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@Test(description = "Test case is about name",priority = 1)

	public void Empregistration() {

		driver.findElement(By.name("username")).sendKeys("abhishek@marolix.com");
		driver.findElement(By.name("password")).sendKeys("Reset@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);

	}

	@Test(description = "Testcase is about email",dependsOnMethods = "Empregistration",priority = 2)
	public void Emplogin() {

		driver.findElement(By.name("username")).sendKeys("abhishek@marolix.com");
		driver.findElement(By.name("password")).sendKeys("Reset@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);

	}

	@Test(description = "Testcase is about phone",priority = 3)
	public void EmpDatainsertion() {

		driver.findElement(By.name("username")).sendKeys("abhishek@marolix.com");
		driver.findElement(By.name("password")).sendKeys("Reset@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);

	}

	@Test(priority = 4,enabled = false)
	public void emplogout() {

		driver.findElement(By.name("username")).sendKeys("abhishek@marolix.com");
		driver.findElement(By.name("password")).sendKeys("Reset@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);

	}

}
