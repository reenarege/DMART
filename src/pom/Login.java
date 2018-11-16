package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(linkText = "Skip for now")
	private WebElement sfn;

	@FindBy(linkText = "Sign-in") 
	private WebElement signin; 
	  
	 
	@FindBy(name = "mobileNumber") 
	private WebElement mobilenumber; 
	  
	 
	@FindBy(name = "password") 
	private WebElement password; 
	  
	 
	@FindBy(xpath="//button[@class='signin__btn-cta button-primary']") 
	private WebElement login; 
	  	 
	public Login(WebDriver driver) 
	 { 
	  	PageFactory.initElements(driver,this); 
	 } 
	  	 
	public void signinbtton() 
	 { 
	  	sfn.click();
		signin.click(); 
	 } 
	  	 
	public void mobilenumtxtbox(String name) 
	 { 
		mobilenumber.sendKeys(name); 
	 } 
	  	 
	public void passwordtxtbox(String pass) 
	 {
	  	password.sendKeys(pass); 
	 } 
	public void loginbtn() 
	 { 
		login.click(); 
	 } 
}
