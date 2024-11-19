package TC_Repo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilitity.BaseClass;
import objectRepo.ContactPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;
@Listeners(GenericUtilitity.ListenerImplementation.class)

public class TC_009 extends BaseClass
{
	@Test(groups="Regression")
	public void Tc_009() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsmenu();
		Assert.fail();
		ContactPage cp=new ContactPage(driver);
		cp.clickonCreateNewContact();
		String First_name=eutil.getDataFromExcel("Contact", 1, 1);
		String Last_Name=eutil.getDataFromExcel("Contact", 1, 2);
		String title=eutil.getDataFromExcel("Contact", 1, 1);
		CreatingNewContactPage ncp=new CreatingNewContactPage(driver);
		ncp.createNewContact(First_name, Last_Name, title);
		System.out.println("Method Executed");
	}	
}
