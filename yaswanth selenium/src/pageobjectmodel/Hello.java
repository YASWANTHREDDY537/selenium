package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hello {
	public Hello(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name ="username")
	private WebElement user;
	
	@FindBy(name ="password")
	private WebElement pass;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}
	}
		
	

