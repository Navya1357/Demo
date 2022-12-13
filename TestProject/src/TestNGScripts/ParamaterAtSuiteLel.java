package TestNGScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterAtSuiteLel {

	@Test
	@Parameters ({"val1", "val2"})
	public void Sum(int v1, int v2) {
		int finalsum = v1 + v2;
		System.out.println("The final sum of the given values is " + finalsum);
	}

	@Test
	@Parameters ({"val1", "val2"})
	public void Diff (int v1, int v2) {
		int finaldiff = v1 - v2;
		System.out.println("The final difference of the given values is " + finaldiff);
	}
	@Test
	@Parameters ({"val1", "val2"})
	public void mul(int v1, int v2) {
		int prod = v1*v2;
		System.out.println("The Product Of Value 1 and 2 is " + prod);

	}    
}


