package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "//input[@class='search-toolbar__field js-search-field']") 
	private WebElement searchtbox; 
	  
  	@FindBy(xpath= "//i[@class='search__icon icon-search']") 
	private WebElement serachbtn; 
	 
	public Homepage(WebDriver driver) 
	{ 
	  		PageFactory.initElements(driver,this); 
	  	} 
	  	 
	  	public void searchtxtbox(String pname) 
	  	{ 
	  		searchtbox.sendKeys(pname); 
	  	} 
	  
	 
	  	public void serachbutton() 
	  	{ 
	  		serachbtn.click(); 
	  	} 


}
