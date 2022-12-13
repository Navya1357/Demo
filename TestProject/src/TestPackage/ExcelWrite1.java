package TestPackage;

import org.testng.annotations.Test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
  
public class ExcelWrite1 {
      
      @Test
    public void geekforgeeks() throws IOException{
          
         try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet sheet=workbook.createSheet("sheet1");
			 XSSFSheet sheet1=workbook.createSheet("sheet2");
			      
			    // Creating HashMap and entering data
			    HashMap<String,String> map=new HashMap<String,String>();
			    map.put("1", "John");
			    map.put("2", "Joey");
			    map.put("3", "Ross");
			    map.put("4", "Rachel");
			      
			    int rowno=1;
			   			      
			    for(@SuppressWarnings("rawtypes") HashMap.Entry entry:map.entrySet()) {
			        XSSFRow row=sheet.createRow(rowno++);
			        row.createCell(1).setCellValue((String)entry.getKey());
			        row.createCell(2).setCellValue((String)entry.getValue());
			    }
			    
			    int rowno1=1;
			    for(@SuppressWarnings("rawtypes") HashMap.Entry entry:map.entrySet()) {
			        XSSFRow row=sheet1.createRow(rowno1++);
			        row.createCell(1).setCellValue((String)entry.getKey());
			        row.createCell(2).setCellValue((String)entry.getValue());
			    }   
			    
      
			    FileOutputStream file = new FileOutputStream("C:\\Navya\\style.xlsx");
			    workbook.write(file);
			    file.close();
		}
         System.out.println("Data Copied to Excel");
         
    }
}