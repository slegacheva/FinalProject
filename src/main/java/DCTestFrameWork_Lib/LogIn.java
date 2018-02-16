package main.java.DCTestFrameWork_Lib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogIn {
	@FindBy(name="identity")
	public WebElement UserName;
	
	@FindBy(name= "password")
	public WebElement Password;
	
	@FindBy(className="btn-authentication")
	public WebElement LogInButton;

	WebDriver driver;
	
	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
