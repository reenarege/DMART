package scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import pom.Login;

public class Invalidlogin extends Basetest{
	@Test 
	public void invalid() 
	  	{ 
	  		Login l=new Login(driver); 
	  		l.signinbtton(); 
	  		String name = Excel.getdata(excelpath,"Sheet1",1,0); 
	  		l.mobilenumtxtbox(name); 
	  		String pass = Excel.getdata(excelpath,"Sheet1",1,1); 
	  		l.passwordtxtbox(pass); 
	  		l.loginbtn(); 
	  	} 

}
