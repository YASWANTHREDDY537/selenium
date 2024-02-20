package advanceselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@DataProvider(name="alpha")
	public String[][] deatils() {
		String[][] data= {
				{"hello@gmail.com","hello@123"},
				{"baby@gmail.com","baby@123"},
				{"miya@gmail.com","miya@123"},
				{"alpha@gmail.com","alpha@123"}
		};
		return data;
		
	}
	@Test(dataProvider = "alpha")
	public void login(String email,String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.quit();
		
	}
	
	

}
