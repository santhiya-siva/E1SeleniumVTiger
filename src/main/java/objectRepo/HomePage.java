package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index' and text()='Leads']")private WebElement Leads;
    @FindBy(xpath="//a[@href='index.php?module=Accounts&action=index' and text()='Organizations']")private WebElement Organizations;
    @FindBy(xpath="//a[@href='index.php?module=Contacts&action=index' and text()='Contacts']")private WebElement Contacts;
    @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement AccountIcon;
    @FindBy(xpath="//a[text()='Sign Out']")private WebElement SignOut;
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	}
	public WebElement getLeads() {
		return Leads;
	}
	public WebElement getOrganizations() {
		return Organizations;
	}
	public WebElement getContacts() {
		return Contacts;
	}
	public WebElement getAccountIcon() {
		return AccountIcon;
	}
	public WebElement getSignOut() {
		return SignOut;
	}
    public void clickOnleadmenu()
    {
    	getLeads().click();
    }
    public void clickOnOrganizationmenu()
    {
    	getOrganizations().click();
    }
    public void clickOnContactsmenu()
    {
    	getContacts().click();
    }
    public void clickOnAccountIconmenu()
    {
    	getAccountIcon().click();
    }
    public void clickOnSignOutmenu(WebDriver driver)
    {
    	Actions act=new Actions(driver);
    	act.moveToElement(AccountIcon).perform();    	
    	getSignOut().click();
    }
    
}
