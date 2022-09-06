package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.Library.AdminModuleconstants;
import OrangeHRM.Library.User;

public class UserRegTest extends AdminModuleconstants
{
	@Parameters({"role","empname","uname","pword"})
	@Test 
	public void Userregistration(String role,String empname, String uname, String pword) throws InterruptedException
	{
	User us = new User();
	boolean res=us.addUser(role, empname, uname, pword);
	Assert.assertTrue(res);

	}
}
