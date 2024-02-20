package advanceselenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependonmethod {
	

	@Test
	public void createAccount() {
		Reporter.log("creata account", true);
		
	}
	@Test
	public void editAccount() {
		Reporter.log("edit account", true);
		
	}
	@Test(dependsOnMethods = {"createAccount","editAccount"})
	public void deleteAccount() {
		Reporter.log("delete account", true);
		
	}
}
