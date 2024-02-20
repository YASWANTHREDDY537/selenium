package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {

	public Register_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "Gender")
	 private WebElement genderbutton;


	@FindBy(id ="FirstName")
	private WebElement Firstnametextfield;

	@FindBy(id = "LastName")
	private WebElement Lastnamefield;

	
	@FindBy( id = "Email")
	private WebElement emailtextfield;

	
	@FindBy(id ="Password")
	private WebElement passwordtext;
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;

	
	public WebElement getRegisterbutton() {
		return registerbutton;
	}


	public void setRegisterbutton(WebElement registerbutton) {
		this.registerbutton = registerbutton;
	}
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordfield;


	public WebElement getGenderbutton() {
		return genderbutton;
	}


	public WebElement getFirstnametextfield() {
		return Firstnametextfield;
	}


	public WebElement getLastnamefield() {
		return Lastnamefield;
	}


	public WebElement getEmailtextfield() {
		return emailtextfield;
	}


	public WebElement getPasswordtext() {
		return passwordtext;
	}


	public WebElement getConfirmpasswordfield() {
		return confirmpasswordfield;
	}

}
