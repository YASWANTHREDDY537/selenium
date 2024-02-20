package advanceselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class Baseclass {
	WebDriver driver;

	@Parameters("BrowserName")
	@BeforeClass
	public void tolauchbrowser( String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		Reporter.log("launch the browser", true);
		driver.manage().window().maximize();
		Reporter.log("windows maximize successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@BeforeMethod
	public void login() {
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("successsfully open url", true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("login click is succesfully", true);
		driver.findElement(By.id("Email")).sendKeys("gyaswanthreddy2000@gmail.com");
		Reporter.log("entered email is successfully", true);
		driver.findElement(By.id("Password")).sendKeys("19kh1a0537@A");
		Reporter.log("entered password is successfully", true);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Reporter.log("login button click   successfully", true);
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logout successfully", true);
	}

	@AfterClass
	public void closebrowser() {
		Reporter.log("close the brower", true);
		driver.quit();
		Reporter.log("browser successfully closed ", true);

	}
}
