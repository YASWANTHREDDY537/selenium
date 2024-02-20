package yas;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpostion {
	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		   d.manage().window().setPosition(new Point(10, 20));
		 
	}

}