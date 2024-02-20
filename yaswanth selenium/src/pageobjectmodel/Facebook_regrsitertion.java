package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_regrsitertion {
	public Facebook_regrsitertion(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstname")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement lastname;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailtextfiled() {
		return emailtextfiled;
	}

	@FindBy(name = "reg_email__")
	private WebElement emailtextfiled;

}
