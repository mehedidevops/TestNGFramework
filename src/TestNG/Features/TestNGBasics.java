package TestNG.Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	// this all are prerequisite/precondition annotations ----start with --@Before--STCM(Suite,Test,Class,Method)
	
	@BeforeSuite //1
	public void setUP() {
		System.out.println("@BeforeSuite--setup system property for chrome");
	}
	
	@BeforeTest  //2
	public void launchBrowser() {
		System.out.println("@BeforeTest--launch chrome browser");
	}
	
	@BeforeClass //3
	public void enterURL() {
		System.out.println("@BeforeClass--enter URL");
	}
	
	@BeforeMethod  //4
	public void login() {
		System.out.println("@BeforeMethod--login to app");
	}

	// this is my test cases annotation--- start with ---@Test
	
	/**
	*@BeforeMethod
	*@Test-1
	*@AfterMethod
	*
	*@BeforeMethod
	*@Test-2
	*@AfterMethod
	*
	*@BeforeMethod
	*@Test-3
	*@AfterMethod
	*
	**/
	
	
	
	
	
	@Test(priority=1)  //5-1
	public void googleTitleTest() {
		System.out.println("@Test1--google title test");
	}
	
	@Test(priority=2)  //5-2
	public void searchTest() {
		System.out.println("@Test2--searchTest");
	}
	
	@Test(priority=3)  //5-3
	public void googleLogoTest() {
		System.out.println("@Test3--google logo test");
	}
	
	
	
	//  this all are requisite/postcondition annotations---- start with ----@After--MCTS(Method,Class,Test,Suite)
	
	@AfterMethod  //6
	public void logOut() {
		System.out.println("@AfterMethod--log out from app");
	}
	
	@AfterClass  //7
	public void closeBrowser() {
		System.out.println("@AfterClass--close browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest--delete all cookies");
	}
	
	@AfterSuite  //9
	public void generateTestReport() {
		System.out.println("@AfterSuite--generate test report");
	}
}
