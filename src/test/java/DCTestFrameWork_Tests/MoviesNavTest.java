/*package test.java.DCTestFrameWork_Tests;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MoviesNavTest extends BaseTest {
  @Test
  public void f() {
  }
  */

package test.java.DCTestFrameWork_Tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class MoviesNavTest extends BaseTest {
 /* @Test
  public void f() {
  }
  */
  //@Test(groups = {"regression", "smoke"})
	@Test	
	public void NavTest() throws InterruptedException{
		 driver.get("https://www.regmovies.com");
		 WebElement element = driver.findElement(By.className("btn-authentication"));
		 element.click();
		 assertEquals(driver.getCurrentUrl(), "https://www.regmovies.com/crown-club#/account/login");
	}
  
  
}



