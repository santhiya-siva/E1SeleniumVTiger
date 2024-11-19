package GenericUtilitity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * Author:Santhiya
 * To read description of class
 */

public class ExcelUtility {
	/**
	 * To read the description of methods
	 * @param Key
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Exception
	{
		FileInputStream fis=new FileInputStream(IpathConstant.ExcelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		return value;
		//System.out.println(value);
		
	}

}
