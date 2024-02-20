package yas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAAA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		  List<WebElement> ele = driver.findElements(By.xpath("//div[@id=\"nav-xshop\"]//a"));
		  for(WebElement link:ele) {
			  System.out.println(link.getText());
		  }
		
		

	}

}
