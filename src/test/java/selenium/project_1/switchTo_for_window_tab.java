package selenium.project_1;

import java.awt.desktop.SystemSleepEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTo_for_window_tab {

	public static void main(String args[])
	{
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice");
	    driver.manage().window().maximize();
	    
	    
	    // store parent window in variable,first need to store parent window
	    String parentWindow=driver.getWindowHandle();
	    System.out.println("parent ID :"+parentWindow);
	    
	    //store mutiple wondows
	    Set<String> allWindow=driver.getWindowHandles();
	    
	    // first find  element of that tab and then click that tab,
	    // then go to the other tab ,theen switch using switch to then
	    // perform activity in other tab
	    
	    driver.findElement(By.id("openwindow")).click(); //change id for tab
	    
	    
	    

	    
	    // switch to new window
	    for(String handle:allWindow)
	    {
	    	if(!handle.equals(parentWindow))
	    	{
               driver.switchTo().window(handle);
               System.out.println("Child ID :"+handle);
               break;
	    	}
	    }
	    
	    //perform action in new tab or window
	    driver.findElement(By.linkText("Courses")).click();
	    
	    
	    
	    // close,it will close current window
	    driver.close();
	    driver.switchTo().window(parentWindow);
	    
	    
	    // try for multi tab or window
	    
	}
}
