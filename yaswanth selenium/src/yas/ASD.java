package yas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ASD {

	public  ASD(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "pass")
	 private WebElement pass;
}
