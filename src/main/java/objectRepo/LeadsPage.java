package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement createNewLeadIcon;


public LeadsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}

public WebElement getCreateNewLeadIcon() {
	return createNewLeadIcon;
}
public void clickonCreateNewLead()
{
	getCreateNewLeadIcon().click();
}
}

