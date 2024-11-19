package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is for creating new lead page POM class
 * @author Admin
 * @version
 */

public class CreatingNewLeadpage {
	@FindBy(xpath="//input[@name='firstname']")private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']")private WebElement LastName;
	@FindBy(xpath="//input[@name='company']")private WebElement Company; 
	@FindBy(xpath="//input[@name='designation']")private WebElement Title;
	@FindBy(xpath="//input[@name='phone']")private WebElement Phone;
	@FindBy(xpath="//input[@name='mobile']")private WebElement Mobile;
	@FindBy(xpath="//input[@name='email']")private WebElement Email;
	@FindBy(xpath="//input[@name='noofemployees']")private WebElement NoOfEmployees ;
	@FindBy(xpath="//textarea[@name='lane']")private WebElement Street;
	@FindBy(xpath="//input[@name='pobox']")private WebElement PoBox;	
	@FindBy(xpath="//input[@name='code']")private WebElement Code;
	@FindBy(xpath="//input[@name='city']")private WebElement City;
	@FindBy(xpath="//input[@name='country']")private WebElement Country;
	@FindBy(xpath="//input[@name='state']")private WebElement State;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement SaveButton;
	public CreatingNewLeadpage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getCompany() {
		return Company;
	}
	public WebElement getTitle() {
		return Title;
	}
	public WebElement getPhone() {
		return Phone;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}
	public WebElement getStreet() {
		return Street;
	}
	public WebElement getPoBox() {
		return PoBox;
	}
	public WebElement getCode() {
		return Code;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}
	/**
	 * This is a Business library to create a new lead For Set_1
	 * @param FirstName
	 * @param LastName
	 * @param Company
	 */
	public void CreateNewLead(String FirstName,String LastName,String Company)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(Company);			
		getSaveButton().click();
		
	}
	/**
	 *  This is a Business library to create a new lead For Set_2
	 * @param FirstName
	 * @param LastName
	 * @param Company
	 * @param Title
	 * @param Phone
	 * @param Mobile
	 * @param Email
	 * @param NoOfEmployees
	 * @param Street
	 * @param PoBox
	 * @param Code
	 * @param City
	 * @param Country
	 * @param State
	 */
	public void CreateNewLead(String FirstName,String LastName,String Company,String Title,String Phone,String Mobile,
			String Email,String NoOfEmployees,String Street,String PoBox,String Code,String City,String Country,String State)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(Company);
		getTitle().sendKeys(Title);
		getPhone().sendKeys(Phone);
		getMobile().sendKeys(Mobile);
		getEmail().sendKeys(Email);
		getNoOfEmployees().sendKeys(NoOfEmployees);
		getStreet().sendKeys(Street);
		getPoBox().sendKeys(PoBox);
		getCode().sendKeys(Code);
		getCity().sendKeys(City);
		getCountry().sendKeys(Country);
		getState().sendKeys(State);
		getSaveButton().click();
	}
	/**
	 
	 *  This is a Business library to create a new lead For Set_3
	 * @param FirstName
	 * @param LastName
	 * @param Company
	 * @param Title
	 * @param Phone
	 * @param Mobile
	 * @param Email
	 * @param NoOfEmployees
	 */
	public void CreateNewLead(String FirstName,String LastName,String Company,String Title,String Phone,String Mobile,
			String Email,String NoOfEmployees)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(Company);
		getTitle().sendKeys(Title);
		getPhone().sendKeys(Phone);
		getMobile().sendKeys(Mobile);
		getEmail().sendKeys(Email);
		getNoOfEmployees().sendKeys(NoOfEmployees);
		getSaveButton().click();
	}
	/**
	 
	 *  This is a Business library to create a new lead For Set_4 
	 * @param FirstName
	 * @param LastName
	 * @param Company
	 * @param Street
	 * @param PoBox
	 * @param Code
	 * @param City
	 * @param Country
	 * @param State
	 */
	public void CreateNewLead(String FirstName,String LastName,String Company,String Street,String PoBox,String Code,String City,String Country,String State)
	{
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getCompany().sendKeys(Company);
		getStreet().sendKeys(Street);
		getPoBox().sendKeys(PoBox);
		getCode().sendKeys(Code);
		getCity().sendKeys(City);
		getCountry().sendKeys(Country);
		getState().sendKeys(State);
		getSaveButton().click();
	}
	
}
		


