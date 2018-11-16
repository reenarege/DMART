package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	@FindBy(linkText="Premia Badam American : 500 gms")
	private WebElement product;
	
	@FindBy(xpath="//a[@class='product-details__btn-addtocart button-primary ']") 
	private WebElement addtocart; 
	  	 
	@FindBy(linkText="Logout") 
	private WebElement logout; 
	  	 
  	 
  	public Cartpage(WebDriver driver) 
  	{ 
  		PageFactory.initElements(driver,this); 
  	} 

  	public void productitem() 
 	{ 
  		product.click();
  	} 
  
	public void addtocart() 
  	{ 
		addtocart.click();
  	}
  
	public void logoutbtn() 
	{ 
		logout.click(); 
	} 
	  
	  

}
