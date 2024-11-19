package TC_Repo;

import org.testng.annotations.Test;

import GenericUtilitity.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationPage;

public class TC_008 extends BaseClass
{
	@Test(groups="smoke")
	public void Tc_008() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationmenu();
		OrganizationPage op=new OrganizationPage(driver);
		op.clickonCreateNewOrganization();
		String Org_Name=eutil.getDataFromExcel("Organization", 1, 1);
		String Website=eutil.getDataFromExcel("Organization", 1, 2);
		String Employees=eutil.getDataFromExcel("Organization", 1, 3);
		String PhoneNo=eutil.getDataFromExcel("Organization", 1, 1);
		String OtherPhone=eutil.getDataFromExcel("Organization", 1, 2);
		String Email=eutil.getDataFromExcel("Organization", 1, 3);		
		String Billing_Add=eutil.getDataFromExcel("Organization", 1, 1);
		String City=eutil.getDataFromExcel("Organization", 1, 2);
		String State=eutil.getDataFromExcel("Organization", 1, 1);
		CreatingNewOrganizationPage cop=new CreatingNewOrganizationPage(driver);
		cop.CreateNewOrganization(Org_Name, Website, Employees, PhoneNo, OtherPhone, Email, Billing_Add, City, State);
		System.out.println("Test Merthod Exceuted");
		
		
	}


}
