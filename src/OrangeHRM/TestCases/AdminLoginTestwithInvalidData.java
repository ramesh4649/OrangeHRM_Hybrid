package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.Library.LoginPage;
import Utils.Apputils;

public class AdminLoginTestwithInvalidData extends Apputils
{
	@Parameters({"uid","pwd"})
	@Test
	public void checkAdminLogin(String uid, String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		
		boolean res=lp.iserrmsgdisplayed();
		Assert.assertTrue(res);
	}
}
