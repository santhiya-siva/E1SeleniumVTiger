package TC_Repo;

import org.testng.annotations.Test;

import GenericUtilitity.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationPage;

public class TC_006 extends BaseClass
{
	@Test
	public void Tc_006() throws Exception
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
		CreatingNewOrganizationPage cop=new CreatingNewOrganizationPage(driver);
		cop.CreateNewOrganization(Org_Name, Website, Employees, PhoneNo, OtherPhone, Email);
		System.out.println("Test Method Exceuted");	
	}
}
