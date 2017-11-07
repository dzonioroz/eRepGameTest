package eRepublikBasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ERepLoginPage {

//	private WebDriver driver;
	WebDriver driver = new FirefoxDriver();
//	private final static String pageTitle = "eRepublik";
	
	public ERepLoginPage(WebDriver driver) {
        getDriver();
    }
	
	public WebDriver getDriver()
	{
	    return this.driver;
	}
	
	public  WebElement getCitizenUsername(){
		return this.driver.findElement(By.id("citizen_email"));
	}
	
	public void setCitizenUsername(String username){
		getCitizenUsername().sendKeys(username);
	}

}
