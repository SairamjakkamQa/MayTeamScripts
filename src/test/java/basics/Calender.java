package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		String Date = "12";
		String Month = "March";
		String Year = "2018";

		driver.findElement(By.id("first_date_picker")).click();

		while (true) {

			String Monyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			String[] Month_Year = Monyear.split(" ");

			String Mnths = Month_Year[0];

			String yrs = Month_Year[1];

			if (Mnths.equalsIgnoreCase(Month) && yrs.equals(Year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
			}
		}

		List<WebElement> date = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

		for (WebElement dates : date) {

			if (dates.getText().equals(Date)) {
				
				dates.click();
				break;

			}

		}
	}

}
