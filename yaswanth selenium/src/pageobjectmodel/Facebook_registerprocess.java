package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_registerprocess {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		Facebook_welcomepage wp = new Facebook_welcomepage(driver);
		wp.getCreatenewaccountbutton().click();
		Facebook_regrsitertion rg = new Facebook_regrsitertion(driver);
		rg.getFirstname().sendKeys("hello");
		rg.getLastname().sendKeys("bye");
		rg.getEmailtextfiled().sendKeys("hello@gmall.com");
	}

}
