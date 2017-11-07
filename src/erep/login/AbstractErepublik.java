package erep.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import eRepublikBasePages.ERepLoginPage;

abstract class AbstractErepublik {
	protected WebDriver driver;
	protected ERepLoginPage eRepublikLoginPage;
	
	@BeforeTest
	protected void prepare(){
		driver = new FirefoxDriver();
	}
	
//	@BeforeTest
//	public void initalize(){
//		eRepublikLoginPage = new ERepLoginPage(driver);
//	}
	
	protected void login(String username, String password){
//		eRepublikLoginPage.setCitizenUsername(username);
//		new ERepLoginPage(this.driver).setCitizenUsername(username);
		driver.findElement(By.id("citizen_email")).sendKeys(username);
		driver.findElement(By.id("citizen_password")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='login_form']/div[1]/p[3]/button")).click();
	}
	
	protected void navigateTo(String link){
		driver.get(link);
	}
	
	@AfterTest
	protected void cleanup(){
		driver.close();
	}

}
