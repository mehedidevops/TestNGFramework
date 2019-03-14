package TestNG.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbayTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDevelopments\\DevTools\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void halfEbayRegPageTest(String firstName, String lastName, String address1, String address2, String city,
			String state, String zipCode, String emailAddress) {

		
	
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);

		driver.findElement(By.xpath("//*[@id='lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);

		driver.findElement(By.xpath("//*[@id='address1']")).clear();
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);

		driver.findElement(By.xpath("//*[@id='address2']")).clear();
		driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(address2);

		driver.findElement(By.xpath("//*[@id='city']")).clear();
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);

		Select select = new Select(driver.findElement(By.xpath("//*[@id='state']")));
		select.selectByVisibleText(state);

		driver.findElement(By.xpath("//*[@id='zip']")).clear();
		driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipCode);

		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailAddress);

		driver.findElement(By.xpath("//*[@id='retype_email']")).clear();
		driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailAddress);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}