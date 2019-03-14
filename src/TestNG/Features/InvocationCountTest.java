package TestNG.Features;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=5)
	public void sum() {
		int a = 20;
		int b = 10;
		int c = a+b;
		System.out.println("Sum C: " + c);
	}

}
