package OrangeHRM.Library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Apputils;


public class Employee extends Apputils
{

	
	public boolean addEmployee(String fname,String lname)
	{
	
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);		
		String empno = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empno);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement emptable;
		emptable = driver.findElement(By.id("resultTable"));
				
		List<WebElement> rows,cols;
		rows = emptable.findElements(By.tagName("tr"));
		
		boolean empexist=false;
		
		for(int i=1;i<rows.size();i++)
		{
			cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empno))				
			{
				empexist= true;
				break;
			}
		}
		
		if(empexist)
		{
			return true;
		}else
		{
			return false;
		}
	}

}

	


