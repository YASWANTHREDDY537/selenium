package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOusedisplayed_enabled {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		WebElement webelement = driver.findElement(By.xpath("//div[text()=\"Log in\"]"));
		System.out.println("before enter the data");
		System.out.println(webelement.isDisplayed());
		System.out.println(webelement.isEnabled());
		System.out.println("==============");
		System.out.println("after the data enter");
		 driver.findElement(By.name("username")).sendKeys("yash");
		 driver.findElement(By.name("password")).sendKeys("hello");
		 System.out.println(webelement.isDisplayed());
			System.out.println(webelement.isEnabled());
		
		

	}

}
