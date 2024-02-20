package testcaseconverstion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseconvertion {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		Window maximum = driver.manage().window();
		maximum.maximize();
	Timeouts wait = driver.manage().timeouts();
	wait.implicitlyWait(Duration.ofSeconds(10));
		 driver.navigate().to("https://www.facebook.com");
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("hello@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("babyiloveyou");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
}
