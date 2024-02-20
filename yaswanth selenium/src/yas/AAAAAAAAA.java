/*package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AAAAAAAAA {
	String ExpectedloginPageTitle = "Demo Web Shop";
	String expectedUsername = "harshithareddyiot@gmail.com";
	String expectedpassword = "Harshitha@123";
     WebDriver driver;
     @Parameters("browserName")
     @BeforeClass
     public void ToLaunchBrowser() {
    	//if(bName.equalsIgnoreCase("Chrome")) {
    	 driver=new ChromeDriver();
    	 //}else if(bName.equalsIgnoreCase("Edge")){
    		// driver=new EdgeDriver();
    	 //}
    	 Reporter.log("Browser got launched successfully", true);
    	 driver.manage().window().maximize();
    	 Reporter.log("Browser maximized successfully", true);
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     }
     @BeforeMethod
     public void ToLogin() {
    	 driver.get("https://demowebshop.tricentis.com/");
    	 String currenttitle = driver.getTitle();
    	 //System.out.println(currenttitle);
//    	 if(ExpectedloginPageTitle.equals(currenttitle)){
//    		 Reporter.log("Browser navigated successfully", true);
//         }
//    	 else {
//    		 Reporter.log("Browser failed to navigate", true);
//    	 }
    	 Assert.assertEquals(currenttitle, ExpectedloginPageTitle, "failed to navigate to the page");
    	 driver.findElement(By.linkText("Log in")).click();
    	 WebElement Emailtextfield = driver.findElement(By.id("Email"));
    	 Emailtextfield.clear();
    	 Emailtextfield.sendKeys(expectedUsername);
    	 String ActualUsername = Emailtextfield.getAttribute("value");
//    	 if(expectedUsername.equals(ActualUsername)) {
//    		 Reporter.log("Username entered successfully", true);
//    	 }
//    	 else {
//    		 Reporter.log("failed to entered the username", true);
//    	 }
    	 Assert.assertEquals(ActualUsername, expectedUsername, "failed to entered the username");
    	 //to enter the password
    	 WebElement passwordtextfield = driver.findElement(By.id("Password"));
    	 passwordtextfield.clear();
    	 passwordtextfield.sendKeys(expectedpassword);
    	 String actualpass = passwordtextfield.getAttribute("value");
//    	 if(expectedpassword.equals(actualpass)) {
//    		 Reporter.log("password entered successfully", true);
//    	 }
//    	 else{
//    		 Reporter.log("failed to enter the password", true);
//    	 }
    	 Assert.assertEquals(actualpass, expectedpassword, "failed to entered the password");
    	 //to use login action
    	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
    	 Reporter.log("successfully login into the application", true);
         }
    	 @AfterMethod
    	 public void  toLogout() {
    	 driver.findElement(By.partialLinkText("Log out")).click();
    	 Reporter.log("logout successfully", true);
    	 }	 
    	 @AfterClass
    	 public void ToClose() {
    		 Reporter.log("browser got logout successfully", true);
    		 driver.quit();
    	 }
}
*/