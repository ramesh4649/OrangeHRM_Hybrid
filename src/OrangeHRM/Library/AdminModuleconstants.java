package OrangeHRM.Library;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.Apputils;

public class AdminModuleconstants extends Apputils
{
	
	
	public static String adminuid = "Admin";
	public static String adminpwd = "Qedge123!@#";
	@BeforeTest
	public void adminlogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys(adminuid);
		driver.findElement(By.id("txtPassword")).sendKeys(adminpwd);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	@AfterTest
	public void adminlogout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
