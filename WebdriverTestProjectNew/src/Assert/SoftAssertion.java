package Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	SoftAssert softAssert = new SoftAssert();
	String className = "SoftAssertion";

	@Test
	public void softAssertTest() {
		softAssert.assertTrue(true == true);
		softAssert.assertEquals("HardAssertion", "HardAssertion");
		softAssert.assertEquals(className, "HardAssertion");
		System.out.println("Success");
	}
	
}
