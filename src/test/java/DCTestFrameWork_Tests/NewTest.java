package test.java.DCTestFrameWork_Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import main.java.DCTestFrameWork_Lib.LogIn;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class NewTest extends BaseTest {
	//@Test
	@Test(groups = {"regression", "smoke"})
	public void LogInTest() throws InterruptedException{
		LogIn login = new LogIn(driver.driver);
		driver.get("https://www.regmovies.com/crown-club#/account/login");
		 login.UserName.sendKeys("slegacheva@gmail.com");	 
		login.Password.sendKeys("WWWWWWWWW");
			login.LogInButton.click();
	
	 assertNotNull(driver.findElement(By.className("error-message")));
	}
 
}
