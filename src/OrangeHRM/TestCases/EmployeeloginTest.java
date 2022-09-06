package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHRM.Library.LoginPage;
import Utils.Apputils;

public class EmployeeloginTest extends Apputils

{
	@Test
	public void checkemployeelogintest(String uid,String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res=lp.isEmpModuleDisplayed();
		Assert.assertTrue(res);
	}
	
	

}
