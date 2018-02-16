package test.java.DCTestFrameWork_Tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import main.java.DCTestFrameWork_Lib.LogIn;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LogInNav extends BaseTest {
 
     
  
  
     @Test(groups = {"regression", "smoke"})	
  	public void NavTest() throws InterruptedException{
    	 LogIn login = new LogIn(driver.driver);
  		 driver.get("https://www.regmovies.com");
  		//driver.findElement(By.className("btn-authentication")).click();
  		 login.LogInButton.click();
  		
  	
  		 assertEquals(driver.getCurrentUrl(), "https://www.regmovies.com/crown-club#/account/login");
  	}
    
}
