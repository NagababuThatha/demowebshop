package demowebshoptestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demowebshoppompackage.Registerpom;

public class Registertest {
	
	@Test
	public void checkregister(){
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		
		Registerpom register1=new Registerpom(driver);
		register1.enterfirstname("naga");
		register1.enterlastname("babu");
		register1.enteremail("nag456@gmail.com");
		register1.enterpassword("nag456");
		register1.enterconfirmpassword("nag456");
		register1.clickRegister();

}
}