package TestNGScripts;

import org.testng.Assert;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DProvider {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod (Method m){
		switch(m.getName()) {
		case "Sum2": 
			return new Object[][]{{2, 3 ,5,10}, {5, 7,12,24},{7,7,14,28}};
		case "Diff2": 
			return new Object[][] {{2, 3, -1}, {5, 7, -2},{6,2,4}};
		}
		return null;
		
	}
	
	@Test (dataProvider = "data-provider")
	 public void Sum2 (int a, int b,int c, int result) {
	      int sum = a + b +c;
	      Assert.assertEquals(result, sum);
	 }
	  
	@Test (dataProvider = "data-provider")
	public void Diff2 (int a, int b, int result) {
	      int diff = a - b;
	      Assert.assertEquals(result, diff);
	 }
}



