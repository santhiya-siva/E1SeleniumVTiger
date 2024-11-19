package TC_Repo;


import org.testng.annotations.Test;

import GenericUtilitity.BaseClass;
import objectRepo.CreatingNewLeadpage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
public class TC_001Test extends BaseClass
{
	@Test
	public void Tc_001() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnleadmenu();
		LeadsPage lep=new LeadsPage(driver); 
		lep.clickonCreateNewLead();
		String FirstName=eutil.getDataFromExcel("Leads", 2, 1);
		String LastName=eutil.getDataFromExcel("Leads", 2, 2);
		String Company=eutil.getDataFromExcel("Leads", 2, 3);
		CreatingNewLeadpage clp=new CreatingNewLeadpage(driver);
		clp.CreateNewLead(FirstName, LastName, Company);	
		System.out.println("Test method excecuted");
	}
		}
	
