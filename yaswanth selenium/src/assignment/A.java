package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A {
	public A(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}

	@FindBy()
}
