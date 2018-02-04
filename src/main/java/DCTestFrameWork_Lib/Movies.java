package main.java.DCTestFrameWork_Lib;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Movies {
	@FindBy(css="div.filter-set.filters-movietype > h3 > span")
	public WebElement MovieType;
	
	@FindBy(name= "movietype")
	public List<WebElement> MovieTypeCheckbox;
	
	@FindBy(className="filter-title")
	public List<WebElement> MovieFilters;

	WebDriver driver;
	
	public Movies(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
