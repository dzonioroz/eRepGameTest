package erep.login;

import org.testng.annotations.Test;

@Test
public class LoginToErepublik extends AbstractErepublik{
	public void loginToErepublik(){
		navigateTo("https://erepublik.com");
		login("username","password");
	}
	
	

}
