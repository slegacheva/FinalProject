package main.java.DCTestFrameWork_Lib;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver implements WebDriver {

	public WebDriver driver;
	String browserName;
	
	public Driver(String browserName) {
		this.browserName = browserName;
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
			this.driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
		    System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
			this.driver = new FirefoxDriver();
		}
		
		//TODO add the rest of the browsers
	}
	
	public void get(String url) {
		this.driver.get(url);
	}

	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}

	public String getTitle() {
		return this.driver.getTitle();
	}

	public List<WebElement> findElements(By by) {
		return this.driver.findElements(by);
	}

	public WebElement findElement(By by) {
		return this.driver.findElement(by);
	}

	public String getPageSource() {
		return this.driver.getPageSource();
	}

	public void close() {
		this.driver.close();		
	}

	public void quit() {
		 this.driver.quit();
	}

	public Set<String> getWindowHandles() {
		return this.driver.getWindowHandles();
	}

	public String getWindowHandle() {
		return this.driver.getWindowHandle();
	}

	public TargetLocator switchTo() {
		return this.driver.switchTo();
	}

	public Navigation navigate() {
		return this.driver.navigate();
	}

	public Options manage() {
		return this.driver.manage();
	}

}