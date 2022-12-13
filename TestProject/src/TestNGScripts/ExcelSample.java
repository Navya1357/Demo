package TestNGScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSample {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\TestProject\\src\\TestData\\Testdata.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet s = wb.getSheet("Sheet1");
	Row r =s.getRow(2);
	Cell c = r.getCell(2);
	String v = c.getStringCellValue();
	System.out.println(v);
	 
	 
	}

}
