package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DataDrivenFromProperties {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\shiva\\Documents\\Section-3\\DataDriven.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("url");
		System.out.println(value);
		String value1=prop.getProperty("username");
		System.out.println(value1);
		String value2=prop.getProperty("password");
		System.out.println(value2);
		
		
	}

}
