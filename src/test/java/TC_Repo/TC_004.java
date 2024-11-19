package TC_Repo;

import org.testng.annotations.Test;

import GenericUtilitity.BaseClass;
import objectRepo.CreatingNewLeadpage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_004 extends BaseClass{
	@Test
	public void Tc_004()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnleadmenu();
		LeadsPage lep=new LeadsPage(driver); 
		lep.clickonCreateNewLead();
		String FirstName=eutil.getDataFromExcel("Leads", 5, 1);
		String LastName=eutil.getDataFromExcel("Leads", 5, 2);
		String Company=eutil.getDataFromExcel("Leads", 5, 3);
		String Street=eutil.getDataFromExcel("Leads", 5, 4);
		String PoBox=eutil.getDataFromExcel("Leads", 5, 5);
		String Code=eutil.getDataFromExcel("Leads", 5, 6);
		String City=eutil.getDataFromExcel("Leads", 5, 7);		
		String Country=eutil.getDataFromExcel("Leads", 5, 8);
		String State=eutil.getDataFromExcel("Leads", 5, 9);
		CreatingNewLeadpage clp=new CreatingNewLeadpage(driver);
		clp.CreateNewLead(FirstName, LastName, Company, Street, PoBox, Code, City, Country, State);
		System.out.println("Test method excecuted");
	}


}
