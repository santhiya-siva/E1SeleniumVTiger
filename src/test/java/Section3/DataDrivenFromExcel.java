package Section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenericUtilitity.IpathConstant;

public class DataDrivenFromExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\Selenium\\CRM.VTIGER\\src\\test\\resources\\TestData\\DataDriven.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet("Admin").getRow(1).getCell(0);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(c);
		System.out.println(value);
		
	}
}
