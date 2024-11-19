package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionProgram {
	@Test(priority=1)
	public void strictcomparisonHardAssert()
	{
		String expectedvalue="sandy";
		String actualvalue="sandy";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("Strictcomparion hardAssert completed");
	}
	@Test(priority=2)
	public void containscomparisonHardAssert()
	{
		String expectedvalue="sandy";
		String actualvalue="sandy";
		Assert.assertEquals(actualvalue,expectedvalue);
		System.out.println("Contains comparison completed");
	}

}
