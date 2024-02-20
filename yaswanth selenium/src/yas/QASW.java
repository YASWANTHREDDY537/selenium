package yas;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.hwpf.model.FileInformationBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class QASW {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		FileInputStream fs = new FileInputStream("./testdata/test.properties");
		Properties ps = new Properties();
		ps.load(fs);
		String url = ps.getProperty("url");
		String user = ps.getProperty("username");
		String pass = ps.getProperty("password");
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		
		
	}
}
