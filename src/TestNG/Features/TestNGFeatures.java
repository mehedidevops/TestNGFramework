package TestNG.Features;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest(){
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regTest() {
		System.out.println("reg test");
	}
}
