package TestNGScripts;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Isuite implements ISuiteListener {
	public void onStart(ISuite suite) {	
		System.out.println("onStart function started "  + suite.getName());
	}
	public void onFinish(ISuite suite) {
		System.out.println("onFinish function started "  + suite.getName());
	}	
}
