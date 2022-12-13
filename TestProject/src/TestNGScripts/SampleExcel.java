package TestNGScripts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SampleExcel {
  @Test
  public void f() throws IOException {
	  try (XSSFWorkbook workbook = new XSSFWorkbook()) {
		XSSFSheet sheet = workbook.createSheet();
		HashMap<String, String> map = new HashMap<String, String>();
		 map.put("1", "ABC");
		 map.put("2", "XYZ");
		 
		 int rowno1=1;
		    for(@SuppressWarnings("rawtypes") HashMap.Entry entry:map.entrySet()) {
		        XSSFRow row=sheet.createRow(rowno1++);
		        row.createCell(1).setCellValue((String)entry.getKey());
		        row.createCell(2).setCellValue((String)entry.getValue());
		    }   

		    FileOutputStream file = new FileOutputStream("C:\\Navya\\style.xlsx");
		    workbook.write(file);
		    file.close();
	}
}
}


