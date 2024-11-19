package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This is for creating new Contact page POM class
 * @author Admin
 * @version
 */

public class CreatingNewContactPage {
	@FindBy(xpath="//input[@name='firstname']")private WebElement First_name;
	@FindBy(xpath="//input[@name='lastname']")private WebElement Last_name;
	@FindBy(xpath="//input[@name='title']")private WebElement title;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement SaveButton;
	
	public CreatingNewContactPage(WebDriver driver)
	{
    	PageFactory.initElements(driver, this);
    	}

	public WebElement getFirst_name() {
		return First_name;
	}

	public WebElement getLast_name() {
		return Last_name;
	}

	public WebElement getTitle() {
		return title;
	}
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	 /**
	  * This is a Business library to create a new Contact For Set_1
	
	  * @param First_name
	  * @param Last_Name
	  * @param title
	  */
	public void createNewContact(String First_name,String Last_Name,String title)
	{
		getFirst_name().sendKeys(First_name);	
		getLast_name().sendKeys(Last_Name);
		getTitle().sendKeys(title);
		getSaveButton().click();
	}
	

	

}
