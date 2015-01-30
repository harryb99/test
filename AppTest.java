package aa.bb;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AppTest {
	
		public WebDriver driver;
		//private String sTestCaseName;
		//private int iTestCaseRow;
		WebElement s;
		//@SuppressWarnings("unchecked")
		@Test
		public void test() {
			
			driver=new FirefoxDriver();
			driver.get("https://www.justrechargeit.com/");
					
			}
}

	