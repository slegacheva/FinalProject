package DCTestFrameWork_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import DCTestFrameWork_Lib.*;

public class BaseTest {
	Driver driver;
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  String browserName = getParamater("browser");
	  driver = new Driver(browserName);
  }
  
  private String getParamater(String name) {
	  String value = System.getProperty(name);
	  if(value == null) {
		  throw new RuntimeException(name + "missing parameter");
	  }
	  return value;
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  driver.quit();
  }

  @BeforeTest(alwaysRun = true)
  public void beforeTest() {
	  System.out.println("This is the before test step");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
