package yas;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YAs {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String ELE = driver.findElement(By.partialLinkText("Books")).getAttribute("");
		System.out.println(ELE);
	}
}
