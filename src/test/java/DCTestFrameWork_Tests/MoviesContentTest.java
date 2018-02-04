package test.java.DCTestFrameWork_Tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;

public class MoviesContentTest extends BaseTest {
 /* @Test
  public void f() {
  }
  */
  @Test
	public void ContentTest() throws InterruptedException {
	  driver.get("https://www.regmovies.com/movies");
	  Object o = driver.findElement(By.className("large-heading"));
	  assertNotNull(o);
  	}
}