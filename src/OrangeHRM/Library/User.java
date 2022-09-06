package OrangeHRM.Library;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.Apputils;

public class User extends Apputils
{

public boolean addUser(String role,String empname,String uname,String pword) throws InterruptedException
{
	
	driver.findElement(By.linkText("Admin")).click();
	driver.findElement(By.linkText("User Management")).click();
	driver.findElement(By.linkText("Users")).click();
	
	driver.findElement(By.id("btnAdd")).click();
	
	Select rolelist = new Select(driver.findElement(By.id("systemUser_userType")));
	rolelist.selectByVisibleText(role);
	driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
	driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
	driver.findElement(By.id("systemUser_password")).sendKeys(pword);
	driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pword);
	
	Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();
	
	driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uname);
	driver.findElement(By.id("searchBtn")).click();
	
	WebElement usertable;
	usertable = driver.findElement(By.id("resultTable"));
	
	List<WebElement> rows,cols;
	rows = usertable.findElements(By.tagName("tr"));
	
	boolean userexist = false;
	for(int i=1;i<rows.size();i++)
	{
		cols = rows.get(i).findElements(By.tagName("td"));
		if(cols.get(1).getText().equalsIgnoreCase(uname))
		{
			userexist = true;
			break;
		}
	}
	
	if(userexist)
	{
		return true;
	}else
	{
		return false;
	}
}



}
