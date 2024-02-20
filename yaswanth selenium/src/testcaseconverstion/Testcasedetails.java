package testcaseconverstion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 */
public class Testcasedetails {
	public static void main(String[] args) {
		// testdata
		// url:https://www.facebook.com/
		// username:alpha@gmail.com
		// password:yash
		// title:Facebook � log in or sign up
		String exceptedurl = "https://www.facebook.com/";
		String exceptedusername = "alpha@gmail.com";
		String exceptedpassword = "yash";
		String exceptedtitle = "Facebook � log in or sign up";
		WebDriver driver = new ChromeDriver();
		System.out.println("browser launch is successfully");
		Window ref = driver.manage().window();

		ref.maximize();
		System.out.println("broswer maximize successfully");
		Timeouts waittime = driver.manage().timeouts();
		waittime.implicitlyWait(Duration.ofSeconds(10));
		driver.get(exceptedurl);
		String actualtitle = driver.getTitle();
		System.out.println("navigated page is displayed");
		System.out.println(actualtitle);
		if (actualtitle.equals(exceptedtitle)) {
			System.out.println("your in correct page");
		} else {
			System.out.println("please navigate corredt page");
		}

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys(exceptedusername);
		String actualusername = email.getAttribute("value");
		if (actualusername.equals(exceptedusername)) {
			System.out.println("nice it a matches username");
		} else {
			System.out.println("please dont login into other account");
		}
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(exceptedpassword);
		String actualpassword = password.getAttribute("value");
		if (actualpassword.equals(exceptedpassword)) {
			System.out.println("your password is right");
		} else {
			System.out.println("please your cannot into other account");
		}
		WebElement login = driver.findElement(By.name("login"));
		if (actualpassword.equals(exceptedpassword) && actualusername.equals(exceptedusername)) {

			login.click();
			System.out.println("your successfully logined");
		} else {
			System.out.println("please enter correct username and password");
		}
		driver.quit();
		
		
	}
}
