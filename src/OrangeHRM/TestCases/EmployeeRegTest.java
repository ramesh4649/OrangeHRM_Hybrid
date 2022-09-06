package OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import OrangeHRM.Library.AdminModuleconstants;
import OrangeHRM.Library.Employee;



public class EmployeeRegTest extends AdminModuleconstants
{
	@Parameters({"fname","lname"})
	@Test
	public void checkempReg(String fname, String lname)
	{
	
		 Employee emp = new Employee();
		 boolean res=emp.addEmployee(fname, lname);
		 Assert.assertTrue(res);
	
	}
}
