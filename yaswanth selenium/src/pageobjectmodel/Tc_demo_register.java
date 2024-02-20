package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_demo_register {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");
		Welcome_page wp = new Welcome_page(driver);
		wp.getRegisterbutton().click();
		Register_page rp = new Register_page(driver);
		
		rp.getGenderbutton().click();
		rp.getFirstnametextfield().sendKeys("yasd");
		rp.getLastnamefield().sendKeys("hello");
		rp.getEmailtextfield().sendKeys("gyaswanth@gmail.com");
		rp.getPasswordtext().sendKeys("hekllo");
		rp.getConfirmpasswordfield().sendKeys("hekllo");
		rp.getRegisterbutton().click();
	}

}
