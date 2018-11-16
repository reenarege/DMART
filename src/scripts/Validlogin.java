
package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Basetest;
import generic.Property;
import pom.Cartpage;
import pom.Homepage;
import pom.Login;

public class Validlogin extends Basetest{
	@Test 
	public void login() throws InterruptedException 
	{ 
	  	Login l=new Login(driver); 
	  	l.signinbtton(); 
	  	
	  	String name = Property.getpropertydata(propertyfilepath,"USERNAME");
	  	l.mobilenumtxtbox(name);
	  	String pass= Property.getpropertydata(propertyfilepath,"PASSWORD"); 
	  	l.passwordtxtbox(pass); 
	  	l.loginbtn(); 
	  	 
	  	Homepage h=new Homepage(driver); 
	  	String pname = Property.getpropertydata(propertyfilepath,"SEARCH"); 
	  	h.searchtxtbox(pname);
	  	h.serachbutton(); 
	  	 
	  	Cartpage c=new Cartpage(driver); 
	  	c.productitem(); 
	  	c.addtocart(); 
	  	 
	  	Thread.sleep(3000); 
	  	c.logoutbtn();
	  
	 
	  } 

}
