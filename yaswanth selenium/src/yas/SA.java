package yas;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SA {
	String name ="gyaswanthreddy2000@gmail.com";

	@Test
	public void run() {
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("gyaswanthreddy2000@gmail.com");
		String actual = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(actual);
		Assert.assertEquals(name, actual,"hello");
	}
}
