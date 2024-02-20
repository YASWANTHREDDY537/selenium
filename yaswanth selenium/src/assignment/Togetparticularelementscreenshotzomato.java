package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Togetparticularelementscreenshotzomato {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		  File shot = driver.findElement(By.xpath(" //img[@alt=\"Zomato logo\" and @loading=\"lazy\"]")).getScreenshotAs(OutputType.FILE);
		  File scr = new File("./errorshot/zomato.png");
		  FileHandler.copy(shot, scr);
		  driver.quit();
		

	}

}
