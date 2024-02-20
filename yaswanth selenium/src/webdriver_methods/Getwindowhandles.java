package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandles {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("file:///C:/Users/pc495/Downloads/html.html");
		
		 driver.findElement(By.xpath("//button[text()='Click Here']")).click();
		   Set<String> ids = driver.getWindowHandles();
		   System.out.println(ids);
		   
		
	}

}
