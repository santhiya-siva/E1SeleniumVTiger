package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertProgram {
	@Test
	public void strictcomparionhardassert()
	{
		String expectedvalue="san";
		String actualvalue="sandy";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualvalue, expectedvalue);
		System.out.println("strict comparison soft assertion completed");
		s.assertAll();
	}
	@Test
	public void containslevelcomparion()
	{
		String expectedvalue="corn";
		String actualvalue="babycorn";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualvalue, expectedvalue);
		System.out.println("contains completed");
		s.assertAll();
	}

}
