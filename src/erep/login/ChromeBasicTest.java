package erep.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBasicTest {
	@Test
	public void chomeTests(){
		System.setProperty("webdriver.chrome.driver", "/home/nikola/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}

}
