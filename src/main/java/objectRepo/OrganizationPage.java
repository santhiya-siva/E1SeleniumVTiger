package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement createNewOrganizationIcon;
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewOrganization() {
		return createNewOrganizationIcon;
	}
	
	/**
	 * This is a business library to click on create new organization icon
	 */
	public void clickonCreateNewOrganization()
	{
		getCreateNewOrganization().click();
	}
}
