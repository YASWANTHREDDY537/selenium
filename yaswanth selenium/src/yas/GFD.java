package yas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GFD extends QSA {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		QSA av =new QSA(driver);
		
		
		av.getPass().sendKeys("jello");
	}
	

}
