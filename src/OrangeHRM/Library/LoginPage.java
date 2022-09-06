package OrangeHRM.Library;



import org.openqa.selenium.By;

import Utils.Apputils;

public class LoginPage extends Apputils
{

	public void login(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();		
	}
	
	
	public boolean isAdminModuleDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isEmpModuleDisplayed()
	{
		try 
		{
			driver.findElement(By.linkText("Admin"));
			return false;
		} catch (Exception e) 
		{
			return true;
		}		
	}
	
	public boolean iserrmsgdisplayed()
	
	{
		String errmsg=driver.findElement(By.id("spanMessage")).getText();
		if (errmsg.toLowerCase().contains("invalid")) 
		{
			return true;
			
		}else 
		{
			return false;
			
		}
	
	}
	
	
	public void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public void add()
	{
		System.out.println("new method added to check in a git hub");
	}
}

