package OrangeHRM.TestCases;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import OrangeHRM.Library.LoginPage;
import Utils.Apputils;

public class AdminLoginTestWithValidData extends Apputils
{
	@Parameters({"adminuid", "adminpwd"})
	@Test
	public void CheckAdminLogin(String url, String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.login(url , pwd);
		
		boolean res=lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
		
	}
	
	
}
