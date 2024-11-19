package GenericUtilitity;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * Author:Santhiya
 * To read description of class
 */
public class PropertyUtility {
	/**
	 * To read the description of methods
	 * @param Key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromPropertiesFile(String Key) throws Exception
	{
		FileInputStream fis=new FileInputStream(IpathConstant.propertiespath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(Key);
		return value;
	}

}
