package yas;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAAAAAAl {

	public static void main(String[] args) throws IOException {
		
		FileInputStream input = new FileInputStream("./testdata/test.properties");
		Properties prop = new Properties();
		prop.load(input);
		 String url = prop.getProperty("url");
		  String user = prop.getProperty("username");
		  String pass = prop.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		

	}

}
