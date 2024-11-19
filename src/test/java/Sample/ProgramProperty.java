package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtilitity.PropertyUtility;

public class ProgramProperty {
	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		PropertyUtility p=new PropertyUtility();
		String URL=p.getDataFromPropertiesFile("url");
		String UN=p.getDataFromPropertiesFile("username");
		System.out.println(URL);
		System.out.println(UN);
		driver.get(URL);
	}

}