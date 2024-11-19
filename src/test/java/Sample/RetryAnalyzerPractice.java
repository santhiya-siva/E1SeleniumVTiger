package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
 //  @Test(retryAnalyzer = GenericUtilitity.RetryAnalyzerImplementation.class)
	public void sample()
	{
		Assert.fail();
		System.out.println("welcome");
	}	

}
