package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@name='user_name']")private WebElement user_name;
    @FindBy(xpath="//input[@name='user_password']")private WebElement password;
    @FindBy(xpath="//input[@id='submitButton']")private WebElement LoginButton;
   
    
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	}

	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	public void loginToApllication(String username,String password)
	{
		getUser_name().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
		
		
	
    
    }
    
}
