package yas;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.instagram.com"));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("jwllo");
		driver.findElement(By.xpath("password")).sendKeys("hello");
		
	}

}
