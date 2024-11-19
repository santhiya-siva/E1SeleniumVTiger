package Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPracticeInvocation {
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("user created");
	}
	@Test(priority=2)
	public void modifyuser()
	{
		System.out.println("modified");
	}
	@Test(priority=6,invocationCount=3,dependsOnMethods= {"deleteUser"})
	public void createuser()
	{
		System.out.println("User Created");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("deleted successfully");
	}

}
