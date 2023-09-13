package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

//		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='male']"));
//		
//		//radiobutton.click();
//		
//		//System.out.println(radiobutton.isSelected()); //true
//		
//		System.out.println(radiobutton.isDisplayed());
//		
//		
//		
//		String Title=driver.findElement(By.xpath("//div[@class='titlewrapper']")).getText();
//		
//		
//		System.out.println(Title);

		WebElement textfield = driver.findElement(By.id("name"));

		System.out.println(textfield.isEnabled());

		driver.close();

	}

}
