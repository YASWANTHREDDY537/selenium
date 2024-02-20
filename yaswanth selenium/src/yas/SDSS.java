package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDSS {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(new String("https://netbanking.hdfcbank.com/netbanking/"));
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
	}
}
