package assignment;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpostion {
	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://meghanafoods.co.in/");

		   driver.manage().window().setPosition( new Point(1000,0));
		   
		
	}

}
