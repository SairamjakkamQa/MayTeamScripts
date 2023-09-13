package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggest {

	public static void main(String[] args) throws Throwable {

WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("APjFqb")).sendKeys("airpods");
		
		Thread.sleep(4000);

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));

		System.out.println(list.size());

		for (WebElement options : list) {

			System.out.println(options.getText());

			if (options.getText().contains("pro 2nd generation")) {

				options.click();
				
				break;
			}

		}

	}

}
