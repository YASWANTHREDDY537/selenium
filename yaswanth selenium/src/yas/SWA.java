package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWA {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://www.instagram.com");
		WebElement user = driver.findElement(By.name("username"));
		user.clear();
		user.sendKeys("hello@gmail.com");
		String text = user.getText();
		System.out.println(text);
		String attrubite = user.getAttribute("name");
		System.out.println(attrubite);
		String tagname = user.getTagName();
		System.out.println(tagname);
		String css = user.getCssValue("padding");
		System.out.println(css);
		Dimension size = user.getSize();
		System.out.println(size);
		Point loc = user.getLocation();
		System.out.println(loc);
		Rectangle rect = user.getRect();
		System.out.println(rect.getDimension());
		boolean displayed = user.isDisplayed();
		System.out.println(displayed);
		boolean enabled = user.isEnabled();
		System.out.println(enabled);
		boolean selected = user.isSelected();
		System.out.println(selected);
		driver.findElement(By.name("password")).sendKeys("hello");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		
	}
}
