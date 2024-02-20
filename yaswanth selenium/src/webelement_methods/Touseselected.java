package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touseselected {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		 WebElement webelement = driver.findElement(By.xpath("//option[text()=\"INR 100 - INR 199 ( 16 ) \"]"));
		 System.out.println(webelement.isSelected());
		 webelement.click();
		 System.out.println(webelement.isSelected());
		 driver.quit();

	}

}
