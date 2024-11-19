package TC_Repo;

import org.testng.annotations.Test;

import GenericUtilitity.BaseClass;
import objectRepo.CreatingNewLeadpage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002Test extends BaseClass
{
	@Test
	public void Tc_002() throws Exception	
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnleadmenu();
		LeadsPage lep=new LeadsPage(driver); 
		lep.clickonCreateNewLead();
		String FirstName=eutil.getDataFromExcel("Leads", 3, 1);
		String LastName=eutil.getDataFromExcel("Leads", 3, 2);
		String Company=eutil.getDataFromExcel("Leads", 3, 3);
		String Title=eutil.getDataFromExcel("Leads", 3, 4);
		String Phone=eutil.getDataFromExcel("Leads", 3, 5);
		String Mobile=eutil.getDataFromExcel("Leads", 3, 6);
		String Email=eutil.getDataFromExcel("Leads", 3, 1);
		String NoOfEmployees=eutil.getDataFromExcel("Leads", 3, 7);
		String Street=eutil.getDataFromExcel("Leads", 3, 8);
		String PoBox=eutil.getDataFromExcel("Leads", 3, 9);
		String Code=eutil.getDataFromExcel("Leads", 3, 10);
		String City=eutil.getDataFromExcel("Leads", 3, 11);		
		String Country=eutil.getDataFromExcel("Leads", 3, 12);
		String State=eutil.getDataFromExcel("Leads", 3, 13);
		CreatingNewLeadpage clp=new CreatingNewLeadpage(driver);
		clp.CreateNewLead(FirstName, LastName, Company, Title, Phone, Mobile, Email, NoOfEmployees, Street, PoBox, Code, City, Country, State);
		System.out.println("Test method excecuted");
	}
	

}
