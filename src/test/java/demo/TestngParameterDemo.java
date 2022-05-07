package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterDemo {
	
	@Parameters({"MyName"})
	@Test
	public void test(@Optional("Dhanoosh") String name) { //Can make it optional
		System.out.println("Name is: " + name);
	}
}
