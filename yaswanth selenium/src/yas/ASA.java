package yas;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ASA {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		File shot = driver.findElement(By.xpath("//div[@role=\"button\"]")).getScreenshotAs(OutputType.FILE);
		File fs =new File("./errorshot/helloqqq.png");
		FileHandler.copy(shot, fs);
	}

}
