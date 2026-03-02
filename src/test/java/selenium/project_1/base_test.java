package selenium.project_1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.node.IntNode;

public class base_test {

	public static WebDriver driver; // object creation
	
	// setup browser
	public void setUp() 
	{
	  driver=new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice");
	  driver.manage().window().maximize();

	}
	
	// close browser
	public void tearDown() {
		if(driver !=null)
		{
			driver.quit();
		}
	}
	
	
	// 1. click
	public void clickElement(By locator)
	{
	   	driver.findElement(locator).click();
	}
	
	
	// 2. clear
	public void clearElement(By locator)
	{
	   	driver.findElement(locator).clear();
	}
	
	// 3. enter text
	public void enterText(By locator,String text)
	{
	   	driver.findElement(locator).sendKeys(text);
	}
	
	
	//switch tab or window with title
	public void switchToWindowBytitle(WebDriver driver,String expectedTitlte)
	{
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			if(driver.getTitle().equalsIgnoreCase(expectedTitlte))
			{
				return;
			}
		}
		
	}
	
	
	// //switch tab or window with index
	public void switchToWindowByIndex(WebDriver driver,int index)
	{
		
	  List<String> handles=new ArrayList<>(driver.getWindowHandles());
	  driver.switchTo().window(handles.get(index));
	}
	
	
	// switch frame with id or name
	  public void switchToFrameWithIdOrName(WebDriver driver,String nameorid) 
	{
	   	driver.switchTo().frame(nameorid);
	}
	
	// switch frame with id or name
	public void switchToFrameWithWebElement(WebDriver driver,WebElement ele) 
	{
	   	driver.switchTo().frame(ele);
	}
	
	
	// switch to default page
	public void switchToDefault(WebDriver driver) 
	{
	   	driver.switchTo().defaultContent();
	}
	
//	//////
}
