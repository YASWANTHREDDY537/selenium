package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tousegetcssselector {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.actitime.com/");
	Thread.sleep(2000);
	  WebElement ref = driver.findElement(By.linkText("Try Free")); 

	 System.out.println(ref.getCssValue("padding"));
	 System.out.println(ref.getCssValue("max-width"));
	 System.out.println(ref.getCssValue("font-size"));
	 System.out.println(ref.getCssValue("background-color"));
	 System.out.println(ref.getCssValue("font-family"));
	 
	 
	 
	}

}
