package Section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcel {
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\\\Selenium\\\\Section-3\\\\DataDrivenExcel.ods");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Leads");
		System.out.println(sh.getLastRowNum());
		DataFormatter df=new DataFormatter();
		for(int i=1;i<=getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				String value=df.formatCellValue(c);
				System.out.println(value);
				
			}
			
		}
		
		
	}

	private static int getLastRowNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
