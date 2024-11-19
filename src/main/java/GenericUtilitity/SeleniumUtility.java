package GenericUtilitity;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
/**
 * This generic method is for ImplicitWait Method
 */
public class SeleniumUtility {
	public void implicitwait(WebDriver driver,int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	/**
	 * This generic method is for maximize window
	 * @param driver
	 */
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * This generic method is for navigate to url
	 * @param driver
	 * @param url
	 */
	public void navigate(WebDriver driver, String url)
	{
		driver.navigate().to(url);
	}
	public String captureScreenshot(WebDriver driver,String screenshotname) throws Exception
	{
		TakesScreenshot  ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot\\"+screenshotname+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();
	}
	
	
	

}
