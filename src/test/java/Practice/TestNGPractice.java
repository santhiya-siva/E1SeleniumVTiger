package Practice;

import org.testng.annotations.Test;

public class TestNGPractice 
{
 @Test (priority=1)
 public void createuser()
 {
	 System.out.println("user successfully created");
	 
 }
 @Test
 public void modifyuser()
 {
	 System.out.println("userModified");
 }
 @Test
 public void deleteuser()
 {
	 System.out.println("user deleted");
 }
 
 }
