package demowebshoptestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demowebshoppompackage.Loginpom;

public class Logintest {
	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		Loginpom login=new Loginpom(driver);
		login.enteremail("nag123@gmail.com");
		login.enterpassword("nag123");
		login.clicklogin();
		
	}

}
