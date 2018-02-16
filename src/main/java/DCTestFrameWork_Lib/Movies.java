package main.java.DCTestFrameWork_Lib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Movies {
	@FindBy(className="shoveler-content")
	public WebElement MovieContent;
	
	@FindBy(className= "large-heading")
	public WebElement MovieContent1;
	
	
	WebDriver driver;
	
	public Movies(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
