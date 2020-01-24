package demowebshoppompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpom {
	WebDriver driver;
	By loginlink=By.xpath("//a[@class='ico-login']");
	By email=By.id("Email");
	By password=By.id("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	 
	public  Loginpom(WebDriver driver){
		 this.driver=driver;
	 }
	public void clickloginlink(){
		 driver.findElement(loginlink).click();
	 }
	 public void enteremail(String em){
		 driver.findElement(email).sendKeys(em);
	 }
	 public void enterpassword(String pwd){
		 driver.findElement(password).sendKeys(pwd);
	 }
	 public void clicklogin(){
		 driver.findElement(login).click();
	 }
}
