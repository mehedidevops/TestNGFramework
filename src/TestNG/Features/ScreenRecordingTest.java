package TestNG.Features;

import org.testng.annotations.Test;
import ScreenRecoder.Util.MyScreenRecorder;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ScreenRecordingTest {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\MyDevelopments\\DevTools\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void amazonTest() throws Exception {
		
		MyScreenRecorder.startRecording("amazonTest");
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.express.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();

		MyScreenRecorder.stopRecording();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
