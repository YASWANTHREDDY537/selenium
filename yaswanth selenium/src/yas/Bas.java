package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Bas {
	WebDriver driver;
	@BeforeClass
	public void tolanuch()
	{
		driver=new ChromeDriver();
		Reporter.log("browser got lanuched successfully", true);
		driver.manage().window().maximize();
		Reporter.log("browser got maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@BeforeMethod
	public void tologin()
	{
		driver.get("https://demowebshop.tricentis.com/tricentis");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("swathiramireddy@123gmail.com");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("successfully logged in", true);
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("successfully logged out", true);

	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("close the browser",true);
	}


}
