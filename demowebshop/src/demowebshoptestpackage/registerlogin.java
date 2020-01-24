package demowebshoptestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demowebshoppompackage.Loginpom;
import demowebshoppompackage.Registerpom;

public class registerlogin {
	WebDriver driver;
	@BeforeMethod
	public void startapp(){
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
         }
	@Test()
	public void checkregister(){
		
		
		Registerpom register1=new Registerpom(driver);
		register1.clickregisterlink();
		register1.enterfirstname("naga");
		register1.enterlastname("babu");
		register1.enteremail("nag4567888@gmail.com");
		register1.enterpassword("nag45678999");
		register1.enterconfirmpassword("nag45678999");
		register1.clickRegister();
		String title=driver.findElement(By.xpath("//*[contains(text(),'Your registration completed')]")).getText();
		String expectedtitle="Your registration completed";
		Assert.assertEquals(expectedtitle,title );
		System.out.println(title);
	}
@Test(priority=1)
public void checklogin(){
	
		Loginpom login=new Loginpom(driver);
		login.clickloginlink();
		login.enteremail("nag45678@gmail.com");
		login.enterpassword("nag45678");
		login.clicklogin();
		String title=driver.findElement(By.xpath("//a[contains(text(),'nag4567888@gmail.com')]")).getText();
		String expectedtitle="nag4567888@gmail.com";
		Assert.assertEquals(expectedtitle,title );
		System.out.println(title);
		
	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}
	

}
