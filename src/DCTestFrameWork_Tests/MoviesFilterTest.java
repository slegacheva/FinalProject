package DCTestFrameWork_Tests;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DCTestFrameWork_Lib.Movies;

public class MoviesFilterTest extends BaseTest {

	@Test
	public void FilterTest() {
	//What do I want this test to do?
		
	//What do I want this test to validate?
		
	//What elements do I need to interact with on the page?
	}
	
	
	@Test(groups = {"regression", "smoke"})
	public void FilterByAnimationTest(){
	  driver.navigate().to("http://www.dccomics.com/movies");
	  try {
		  driver.findElement(By.cssSelector("div.filter-set.filters-movietype > h3 > span")).click();
		  List<WebElement> checkbox = driver.findElements(By.name("movietype"));
	  for(WebElement e : checkbox) {
		  if(e.getAttribute("value").equals("animation")) {
			  e.click();
			  break;
		  }
	  	}
	  //validation
	  List<WebElement> filters = driver.findElements(By.className("filter-title"));
	  Boolean foundFilter = false;
	  for(WebElement e : filters) {
		  if (e.getText().equalsIgnoreCase("animation")) {
			  foundFilter = true;
		  }
	  }
	  assertTrue(foundFilter);
	  }
	  catch(NoSuchElementException e) {
		  e.printStackTrace();
	  }
	}
	
	@Test(groups = {"regression", "smoke"})
	public void FilterByLiveActionTest(){
	  driver.navigate().to("http://www.dccomics.com/movies");
	  try {
		  driver.findElement(By.cssSelector("div.filter-set.filters-movietype > h3 > span")).click();
		  List<WebElement> checkbox = driver.findElements(By.name("movietype"));
	  for(WebElement e : checkbox) {
		  if(e.getAttribute("value").equals("live-action")) {
			  e.click();
			  break;
		  }
	  	}

	  //validation
	  List<WebElement> filters = driver.findElements(By.className("filter-title"));
	  Boolean foundFilter = false;
	  for(WebElement e : filters) {
		  if (e.getText().equalsIgnoreCase("Live Action")) {
			  foundFilter = true;
		  }
	  }
	  assertTrue(foundFilter);
	  }
	  catch(NoSuchElementException e) {
		  e.printStackTrace();
	  }
	}
	
	@Test(groups = {"regression", "smoke"})
	public void FilterByLiveActionAndAnimationTest(){
	  driver.navigate().to("http://www.dccomics.com/movies");
	  try {
		  driver.findElement(By.cssSelector("div.filter-set.filters-movietype > h3 > span")).click();
		  List<WebElement> checkbox = driver.findElements(By.name("movietype"));
	  for(WebElement e : checkbox) {
		  if(e.getAttribute("value").equals("live-action")) {
			  e.click();
		  }
		  if(e.getAttribute("value").equals("animation")) {
			  e.click();
		  }
	  	}
	  //validation
	  List<WebElement> filters = driver.findElements(By.className("filter-title"));
	  String[] filtersToValidate = {"Animation", "Live Action"};
	  Boolean[] didValidate = {false, false};
	  
	  for(WebElement e : filters) {
		  for(int i =0; i < filtersToValidate.length; i++) {
			  if (e.getText().toLowerCase().contains(filtersToValidate[i].toLowerCase())) {
				  didValidate[i] = true;
			  }
		  }
	  }
	  for(int i =0; i<filtersToValidate.length; i++) {
		  if(didValidate[i]==false) {
			  fail(""+filtersToValidate[i] + " not applied");
		  }
	  }
	  }
	  catch(NoSuchElementException e) {
		  e.printStackTrace();
	  }
	}
	
	@Test
	public void FilterByLiveActionWithPOMTest() {
		driver.navigate().to("http://www.dccomics.com/movies");
		Movies p = new Movies(driver);
		try {
			p.MovieType.click();
			for(WebElement e: p.MovieTypeCheckbox) {
				  if(e.getAttribute("value").equals("live-action")) {
					  e.click();
					  break;
				  }
			}
			
		//validation
		Boolean foundFilter = false;
		for(WebElement e : p.MovieFilters) {
			if (e.getText().equalsIgnoreCase("Live Action")) {
				foundFilter = true;
			}
		}
		assertTrue(foundFilter);
		}
		catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
