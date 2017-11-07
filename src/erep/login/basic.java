package erep.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class basic {

	@Test
	public void basicTest() {
		// TODO Auto-generated method stub
		System.out.println("Cao");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://erepublik.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
