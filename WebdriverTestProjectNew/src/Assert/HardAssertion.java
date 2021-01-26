package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	String className = "HardAssertion";
	
	@Test
	public void test() {
		Assert.assertTrue(true == true);
		Assert.assertEquals("HardAssertion", "HardAssertion");
		Assert.assertEquals(className, "HardAssertion");
		System.out.println("Success");
	}
}
