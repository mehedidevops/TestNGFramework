package TestNG.Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	WebDriver driver;

	@Test
	@Parameters({"URL", "searchValue" })
	public void searchTest(String URL, String searchValue) {

		System.setProperty("webdriver.chrome.driver", "C:\\MyDevelopments\\DevTools\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(URL);

		driver.findElement(By.name("q")).sendKeys(searchValue);
		driver.findElement(By.name("btnK")).submit();
	}

}