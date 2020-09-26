package FaliedTC.ng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunCount implements IRetryAnalyzer{

	int min=0;
	int max=3;
	
	public boolean retry(ITestResult result) {
		if (min<max) {
			min ++;
			return true;
		}
		
		return false;
	}
	
}
