package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;


public class ExtentReportDemoWithTestng {
	
	@BeforeSuite
	public void setUp() {

		ExtentReports extent = new ExtentReports();
		
	}
	
	@Test
	public void test() {
		
	}
	
	@AfterSuite
	public void tearDown() {
		
	}
}
