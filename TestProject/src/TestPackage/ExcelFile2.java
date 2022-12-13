package TestPackage;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import ExcelOperation.nopCommerce;
public class ExcelFile2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\TestProject\\src\\TestData\\Testdata.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet s = wb.getSheet("Sheet1");
	 int rc = s.getLastRowNum();
	 System.out.println("Row Count: "+rc);
		for(int i=0; i<=rc; i++)
	{
			Row r =s.getRow(i);
			short cc = r.getLastCellNum();
			 System.out.println("Row: "+ i + " Cell Count: " +cc);
	for(int j=0; j<cc; j++) {
		String v = r.getCell(i).getStringCellValue();
		System.out.println(v+ "");
	}
	System.out.println();
  	}
}
}
//

