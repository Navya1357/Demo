package TestNGScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
  @Test
 
		    @DataProvider (name = "data-provider")
		     public Object[][] dpMethod(){
			 return new Object[][] {{"NAVYA"}, {"G"}};
		     }
			
		    @Test (dataProvider = "data-provider")
		    public void myTest (String val) {
		        System.out.println("Passed Parameter Is : " + val);
		    }
		}
  

