package TestNG.Features;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	/*@Test(timeOut=2)
	public void infiniteLoopTest() {
		int i = 1;
		while (i == 1) {
			System.out.println(i);
		}
	}*/
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void Test1() {
		String x = "100A";
		Integer.parseInt(x);
	}
}