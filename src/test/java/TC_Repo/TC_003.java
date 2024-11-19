package TC_Repo;

import org.testng.annotations.Test;

import GenericUtilitity.BaseClass;
import objectRepo.CreatingNewLeadpage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003 extends BaseClass
{
	@Test
	public void Tc_003()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnleadmenu();
		LeadsPage lep=new LeadsPage(driver); 
		lep.clickonCreateNewLead();
		String FirstName=eutil.getDataFromExcel("Leads", 4, 1);
		String LastName=eutil.getDataFromExcel("Leads", 4, 2);
		String Company=eutil.getDataFromExcel("Leads", 4, 3);
		String Title=eutil.getDataFromExcel("Leads", 4, 4);
		String Phone=eutil.getDataFromExcel("Leads", 4, 5);
		String Mobile=eutil.getDataFromExcel("Leads", 4, 6);
		String Email=eutil.getDataFromExcel("Leads", 4, 7);
		String NoOfEmployees=eutil.getDataFromExcel("Leads", 4, 8);
		CreatingNewLeadpage clp=new CreatingNewLeadpage(driver);
		clp.CreateNewLead(FirstName, LastName, Company, Title, Phone, Mobile, Email, NoOfEmployees);
		System.out.println("Test method excecuted");
	}
	

}
