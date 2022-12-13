package TestPackage;

import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;
  
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
  
public class ExcelWrite {
    
    @Test
    public void geekforgeeks() throws IOException{
          
             try (XSSFWorkbook workbook = new XSSFWorkbook()) {
				XSSFSheet sheet=workbook.createSheet("sheet1");
				  
				XSSFRow row=sheet.createRow(1);
				  
				// Background color
				XSSFCellStyle style=workbook.createCellStyle();
				style.setFillBackgroundColor(IndexedColors.LIGHT_BLUE.getIndex());
				style.setFillPattern(FillPatternType.LESS_DOTS);
				//style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
				//style.setFillPattern(FillPatternType.DIAMONDS);
				  
				XSSFCell cell=row.createCell(1);
				cell.setCellValue("welcome");
				cell.setCellStyle(style);            
				  
				// foreground color
				style=workbook.createCellStyle();
				style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());		
				style.setFillPattern(FillPatternType.FINE_DOTS);
				  
				cell=row.createCell(2);
				cell.setCellValue("Geeks");
				cell.setCellStyle(style);            
				  
				FileOutputStream file = new FileOutputStream("C:\\Navya\\style.xlsx");
				workbook.write(file);
				file.close();
			}
            System.out.println("Style Created"); 
                   
    }
}