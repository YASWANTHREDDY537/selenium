package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_page {

	public Welcome_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement loginbutton;

	@FindBy(linkText = "Register")
	private WebElement registerbutton;
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement Shoppinbutton;
	@FindBy(xpath = "//span[text()='Wishlist']")
	 private WebElement wishlist;
	@FindBy(partialLinkText = "Books")
	 private WebElement booksbutton;
	@FindBy(partialLinkText = "Computers")
	 private WebElement computerbutton;
	@FindBy(partialLinkText = "Electronics")
	 private WebElement electonicsbutton;
	@FindBy(partialLinkText = "Apparel & Shoes")
	 private WebElement apparelshoesbutton;
	@FindBy(partialLinkText = "Digital downloads")
	 private WebElement digitaldownload;
	public WebElement getDigitaldownload() {
		return digitaldownload;
	}
	public void setDigitaldownload(WebElement digitaldownload) {
		this.digitaldownload = digitaldownload;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	public WebElement getShoppinbutton() {
		return Shoppinbutton;
	}
	public WebElement getWishlist() {
		return wishlist;
	}
	public WebElement getBooksbutton() {
		return booksbutton;
	}
	public WebElement getComputerbutton() {
		return computerbutton;
	}
	public WebElement getElectonicsbutton() {
		return electonicsbutton;
	}
	public WebElement getApparelshoesbutton() {
		return apparelshoesbutton;
	}

}
