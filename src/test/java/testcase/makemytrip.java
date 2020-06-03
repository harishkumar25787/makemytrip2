package testcase;
import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;

public class makemytrip extends TestBase {
	
	@Test
	public void maketrip() throws Exception{
		
		
		openBrowser();
		
		click("inputTxt_fromCity");
		input("inputTxt_fromCity","Hyderabad");
		selectByText("from","Hyderabad, India");
		click("selectfrom");
		click("tocity");
		input("inputTxt_toCity","Mumbai");
		selectByText("selectfrom","Mumbai, India");
		click("");
		click("Search.but");
		
		
		
			
	
			Thread.sleep(5000);
		}
	
		
		
}
