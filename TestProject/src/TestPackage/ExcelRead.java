package TestPackage;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
  
import java.util.Iterator;
  
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
  
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
  
public class ExcelRead {
    @Test
    public void geekforgeeks() throws IOException{
              
          FileInputStream file = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\TestProject\\src\\TestData\\Testdata.xlsx");
            XSSFWorkbook wb=new XSSFWorkbook(file);
            XSSFSheet sheet=wb.getSheet("Sheet1");
             // Iterate each row one by one
            Iterator<Row> rIterator = sheet.iterator();
            while (rIterator.hasNext()) 
            {
                Row row = rIterator.next();
                  
                  // For each row, iterate through all the columns
                Iterator<Cell> Cell = row.cellIterator();
                   
                while (Cell.hasNext()) 
                {
                    Cell cell = Cell.next();
                      
                      // Check the cell type
                    switch(cell.getCellType())
                    {
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                          
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()); 
                        break;
                          
                    case FORMULA:
                        System.out.print(cell.getNumericCellValue());
                        break;
					default:
						break;
                    }
                    System.out.print("   ");
                }
                System.out.println();              
            }
            wb.close();
            file.close();
    }
	}