package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is for creating new Organization page POM class
 * @author Admin
 * @version
 */

public class CreatingNewOrganizationPage {
	@FindBy(xpath="//input[@name='accountname']")private WebElement Organization_Name;
	@FindBy(xpath="//input[@name='website']")private WebElement Website;
	@FindBy(xpath="//input[@name='employees']")private WebElement Employess;
	@FindBy(xpath="//input[@name='phone']")private WebElement Phone;
	@FindBy(xpath="//input[@name='otherphone']")private WebElement OtherPhone ;
	@FindBy(xpath="//input[@name='email1']")private WebElement Email;
	@FindBy(xpath="//textarea[@name='bill_street']")private WebElement BillAddress;
	@FindBy(xpath="//input[@name='bill_city']")private WebElement BillCity ;
	@FindBy(xpath="//input[@name='bill_state']")private WebElement BillState;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement SaveButton;
	
	
	public CreatingNewOrganizationPage(WebDriver driver)
	{
    	PageFactory.initElements(driver, this);
    	}


	public WebElement getOrganization_Name() {
		return Organization_Name;
	}


	public WebElement getWebsite() {
		return Website;
	}


	public WebElement getEmployess() {
		return Employess;
	}


	public WebElement getPhone() {
		return Phone;
	}


	public WebElement getOtherPhone() {
		return OtherPhone;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getBillAddress() {
		return BillAddress;
	}


	public WebElement getBillCity() {
		return BillCity;
	}


	public WebElement getBillState() {
		return BillState;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}
	/**
	 
	 *  This is a Business library to create a new Organization For Set_1
	 * @param Org_Name
	 * @param Website
	 * @param Employees
	 */
	public void CreateNewOrganization(String Org_Name,String Website,String Employees)
	{
		getOrganization_Name().sendKeys(Org_Name);
		getWebsite().sendKeys(Website);
		getEmployess().sendKeys(Employees);
		getSaveButton().click();	
	}
	/**

	 *  This is a Business library to create a new Organization For Set_2
	 * @param Org_Name
	 * @param Website
	 * @param Employees
	 * @param PhoneNo
	 * @param OtherPhone
	 * @param Email
	 */
	public void CreateNewOrganization(String Org_Name,String Website,String Employees,
			String PhoneNo,String OtherPhone,String Email)
	{
		getOrganization_Name().sendKeys(Org_Name);
		getWebsite().sendKeys(Website);
		getEmployess().sendKeys(Employees);
		getPhone().sendKeys(PhoneNo);
		getOtherPhone().sendKeys(OtherPhone);
		getEmail().sendKeys(Email);	
		getSaveButton().click();	
	}
	/**
	 
	 *  This is a Business library to create a new Organization For Set_3 
	 * @param Org_Name
	 * @param Website
	 * @param Billing_Add
	 * @param City
	 * @param State
	 */
	public void CreateNewOrganization(String Org_Name,String Website,String Billing_Add,String City,String State)
	{
		getOrganization_Name().sendKeys(Org_Name);
		getWebsite().sendKeys(Website);
		getBillAddress().sendKeys(Billing_Add);
		getBillCity().sendKeys(City);
		getBillState().sendKeys(State);
		getSaveButton().click();	
	}
	/**
	 
	 *  This is a Business library to create a new Organization For Set_4
	 * @param Org_Name
	 * @param Website
	 * @param Employees
	 * @param PhoneNo
	 * @param OtherPhone
	 * @param Email
	 * @param Billing_Add
	 * @param City
	 * @param State
	 */
	public void CreateNewOrganization(String Org_Name,String Website,String Employees,
			String PhoneNo,String OtherPhone,String Email,String Billing_Add,String City,String State)
	{
		getOrganization_Name().sendKeys(Org_Name);
		getWebsite().sendKeys(Website);
		getEmployess().sendKeys(Employees);
		getPhone().sendKeys(PhoneNo);
		getOtherPhone().sendKeys(OtherPhone);
		getEmail().sendKeys(Email);
		getBillAddress().sendKeys(Billing_Add);
		getBillCity().sendKeys(City);
		getBillState().sendKeys(State);
		getSaveButton().click();	
	}
	

}
