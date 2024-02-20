package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_demo_login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Welcome_page wp = new Welcome_page(driver);
		wp.getLoginbutton().click();
		Login_page lg = new Login_page(driver);
		lg.getEmailtextfield().sendKeys("gyaswanthreddy2000@gmail.com");
		lg.getPasswordtextfield().sendKeys("19kh1a0537@A");
		lg.getLoginbutton().click();
	}

}
