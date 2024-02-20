package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Togetscreenshotofparticularelement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.udemy.com/");
		Thread.sleep(2000);
		  File shot = driver.findElement(By.xpath("//img[@loading=\"lazy\" and @alt=\"Udemy\"]")).getScreenshotAs(OutputType.FILE);
		  File scr = new File("./errorshot/udemy.png");
		  FileHandler.copy(shot, scr);
		  driver.quit();
		

	}

}
