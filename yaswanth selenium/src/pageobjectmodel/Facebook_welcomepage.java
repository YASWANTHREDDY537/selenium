package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_welcomepage {

	public Facebook_welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createnewaccountbutton;

	public WebElement getCreatenewaccountbutton() {
		return createnewaccountbutton;
	}

	public void setCreatenewaccountbutton(WebElement createnewaccountbutton) {
		this.createnewaccountbutton = createnewaccountbutton;
	}

}
