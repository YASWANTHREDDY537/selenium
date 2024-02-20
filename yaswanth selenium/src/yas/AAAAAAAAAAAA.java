package yas;

import org.openqa.selenium.chrome.ChromeDriver;

public class AAAAAAAAAAAA {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to(new String("https://www.instagram.com"));
		Welcome we = new Welcome(driver);
		we.getUser().sendKeys("hello");
		we.getPass().sendKeys("gyeasdasda");
		}

}
