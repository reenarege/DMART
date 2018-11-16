package scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import pom.Register;


public class Registeruser extends Basetest{
	@Test 
	public void invalid() 
	  	{ 
	  		Register r=new Register(driver); 
	  		r.registerbutton(); 
	  		String fname = Excel.getdata(excelpath,"Sheet1",2,2); 
	  		r.firstname(fname);
	  		String lname = Excel.getdata(excelpath,"Sheet1",3,2); 
	  		r.lastname(lname);
	  		String mnum = Excel.getdata(excelpath,"Sheet1",0,2);
	  		r.mobnum(mnum);
	  		String email = Excel.getdata(excelpath,"Sheet1",4,2); 
	  		r.emailtxtbox(email);
	  		String pwd = Excel.getdata(excelpath,"Sheet1",1,2);
	  		r.pwdtxtbox(pwd);
	  		r.registeruser();
	  	}

}