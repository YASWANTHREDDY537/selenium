package advanceselenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configurationtestng {
	@BeforeSuite
	public void suit() {
		Reporter.log("before suite", true);
	}
	@AfterSuite
	public void suit1() {
		Reporter.log("after suite", true);
	}
	@BeforeTest
	public void test() {
		Reporter.log("before test", true);
	}
	@AfterTest
	public void test1() {
		Reporter.log("after test", true);
	}
	@BeforeClass
	public void class1() {
		Reporter.log("before calss", true);
	}
	@AfterClass
	public void suit2() {
		Reporter.log("after class", true);
	}
	@BeforeMethod
	public void method1() {
		Reporter.log("before method", true);
	}
	@AfterMethod
	public void method2() {
		Reporter.log("after method", true);
	}

	@Test
	public void configua() {
		Reporter.log("completed configuration", true);
	}
}
