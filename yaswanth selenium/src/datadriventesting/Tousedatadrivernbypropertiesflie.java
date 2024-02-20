 package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tousedatadrivernbypropertiesflie {
	public static void main(String[] args) throws IOException {
		//for takeinput from flie
		FileInputStream fis =new FileInputStream("./testdata/test.properties");
	
		
		//to create file tpye
		Properties pro = new Properties();
		//to load data
		pro.load(fis);

		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
