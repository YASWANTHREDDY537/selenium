package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TOfluchdatafrompropetri {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("./testdata/prop.properties");
		Properties pro = new Properties();
		pro.load(input);
	String url = pro.getProperty("url");
	String first = pro.getProperty("first");
			String last = pro.getProperty("last");
			String gmail = pro.getProperty("gmail");
			String pass = pro.getProperty("pass");
		

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
			driver.findElement(By.name("Gender")).click();
			driver.findElement(By.id("FirstName")).sendKeys(first);
			driver.findElement(By.id("LastName")).sendKeys(last);
			driver.findElement(By.id("Email")).sendKeys(gmail);
			driver.findElement(By.id("Password")).sendKeys(pass);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
			driver.findElement(By.id("register-button")).click();
		
		
	}
}
