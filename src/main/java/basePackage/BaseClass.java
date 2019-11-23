package basePackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method executed");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method executed");
	}

}
