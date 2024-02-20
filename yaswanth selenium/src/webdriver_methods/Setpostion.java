package webdriver_methods;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpostion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com");

		   driver.manage().window().setPosition( new Point(1000,0));
		   
		
	}

}
