package selenium.project_1;

import static org.junit.jupiter.api.DynamicTest.stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.Module.SetupContext;

public class base_test_for_iframe_switchTo extends base_test
{
	 
    static By openFrame=By.id("courses-iframe") ;
    static By coursesLink=By.linkText("Courses");	
	
   public static void main(String args[]) 
   {
	   String nameframeString="courses-iframe";
	   
	   base_test_for_iframe_switchTo  obj=new base_test_for_iframe_switchTo();
	   obj.setUp();   
	  
	   WebElement framElement=driver.findElement(openFrame);
//	  obj.switchToFrameWithWebElement(driver,framElement); // we made it static so dont need to do obj.openframe
	  
	   
	   // use above 2 line or below 2 line
	   
	   obj.switchToFrameWithIdOrName(driver, nameframeString);
	  obj.clickElement(coursesLink);
	  
	  obj.switchToDefault(driver);
	  
	  System.out.println("end");

  }
} 
