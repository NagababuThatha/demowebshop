package demowebshoppompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpom {
	WebDriver driver;
	By registerlink=By.xpath("//*[@class='ico-register']");
	By firstname=By.id("FirstName");
	By lastname=By.id("LastName");
	By email=By.id("Email");
	By password=By.id("Password");
	By confirmpassword=By.id("ConfirmPassword");
	By register=By.xpath("//input[@id='register-button']");
	
	 public  Registerpom(WebDriver driver){
		 this.driver=driver;
	 }
	 public void clickregisterlink(){
		 driver.findElement(registerlink).click(); 
	 }
	 public void enterfirstname(String fn){
		 driver.findElement(firstname).sendKeys(fn);
	 }
	 public void enterlastname(String ln){
		 driver.findElement(lastname).sendKeys(ln);
	 }
	 public void enteremail(String em){
		 driver.findElement(email).sendKeys(em);
	 }
	 public void enterpassword(String pwd){
		 driver.findElement(password).sendKeys(pwd);
	 }
	 public void enterconfirmpassword(String pwd){
		 driver.findElement(confirmpassword).sendKeys(pwd);
	 }
	 public void clickRegister(){
		 driver.findElement(register).click();
	 }
	
	

	


}
