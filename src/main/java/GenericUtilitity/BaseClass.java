package GenericUtilitity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;//for listereners driver
	public SeleniumUtility sutil=new SeleniumUtility();
	public PropertyUtility putil=new PropertyUtility();
	public ExcelUtility eutil= new ExcelUtility();
	@BeforeSuite(alwaysRun=true)
	public void dbconnection()
	{
		System.out.println("DB connection created");
		
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional("chrome")String Browser) throws Exception
	{
		if (Browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (Browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else 
			{
			driver=new ChromeDriver();
		}
		sdriver=driver;
		sutil.implicitwait(driver, 15);
		sutil.maximizewindow(driver);
		String URL=putil.getDataFromPropertiesFile("url");
		sutil.navigate(driver, URL);
		System.out.println("Browser Launched Successfully");
	}
	@BeforeMethod(alwaysRun=true)
	public void loginoperation() throws Exception
	{
		String UN=putil.getDataFromPropertiesFile("username");
		String PWD=putil.getDataFromPropertiesFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApllication(UN, PWD);
		System.out.println("Login Successfull");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutoperation()
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnSignOutmenu(driver);
		System.out.println("Signout successfully");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	@AfterSuite(alwaysRun=true)
	public void CloseDBConnection()
	{
		System.out.println("DB connection closed");
	}

}