package yas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countoflinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		System.out.println(tag.size());
	}
}
