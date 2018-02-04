package test.java.DCTestFrameWork_Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class NewTest extends BaseTest {
	@Test
	public void LogInTest() throws InterruptedException{
		 driver.get("https://www.regmovies.com/crown-club#/account/login");
	driver.findElement(By.name("identity")).sendKeys("slegacheva@gmail.com");	 
	driver.findElement(By.name("password")).sendKeys("WWWWWWWWW");
	driver.findElement(By.className("btn-authentication")).click();
	
	 assertNotNull(driver.findElement(By.className("error-message")));
	}
 
}
