package Sample;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws Exception 
	{
	    WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("C:\\Users\\shiva\\Documents\\Section-3\\DataDriven.properties");
		Properties prop=new Properties();
		prop.load(fis);
	}

}
