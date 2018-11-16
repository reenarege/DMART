package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	@FindBy(xpath="a[class='dropdown-register']") 
	private WebElement reg;
	
	@FindBy(xpath="input[class='form__input firstName_reg']") 
	private WebElement fname;
	
	@FindBy(xpath="input[class='form__input lastName_reg']") 
	private WebElement lname;
	
	@FindBy(xpath="input[class='form__input js-mobileNumber']") 
	private WebElement mobnum;
	
	@FindBy(xpath="input[class='form__input email_reg']") 
	private WebElement email;
	
	@FindBy(xpath="input[class='form__input reg_showInput password_reg']") 
	private WebElement pswd;
	
	@FindBy(xpath="input[class='form__input tcAgree']") 
	private WebElement iagree;
	
	@FindBy(xpath="button[class='registration__btn-cta button-primary']") 
	private WebElement regbtn;
	
	public Register(WebDriver driver) 
	 { 
	  	PageFactory.initElements(driver,this); 
	 } 
	  	 
	public void registerbutton() 
	 { 
	  	reg.click(); 
	 } 

	public void firstname(String name) 
	 { 
		fname.sendKeys(name); 
	 } 
	
	public void lastname(String name) 
	 { 
		lname.sendKeys(name); 
	 } 
	
	public void mobnum(String name) 
	 { 
		mobnum.sendKeys(name); 
	 } 
	
	public void emailtxtbox(String name) 
	 { 
		email.sendKeys(name); 
	 }
	
	public void pwdtxtbox(String name) 
	 { 
		pswd.sendKeys(name); 
	 }
	
	public void registeruser() 
	 { 
		iagree.click();
		regbtn.click();
	 }
}
