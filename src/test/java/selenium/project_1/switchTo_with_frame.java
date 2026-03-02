package selenium.project_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//using id,name
//public class switchTo_with_frame {
//   public static void main(String argsp[])
//   {
//	   WebDriver driver=new ChromeDriver();
//	   driver.get("https://rahulshettyacademy.com/AutomationPractice");
//	   driver.manage().window().maximize();
//	   
//	   //store parent wondow info
//	  String parentWidow = driver.getWindowHandle();
//	  
//	  Set<String> allwindow=driver.getWindowHandles();
//	  
//	  //switch to frame using id,class or xpath
//	  driver.switchTo().frame("courses-iframe"); // we cant specify what it is id or name
 
//	  
//	  //now perform action of iframe
//	  driver.findElement(By.linkText("Courses")).click();
//	  
//	  //switch back to main content
//	  driver.switchTo().defaultContent();
//	    
//   }
//		
//}


//using element like id ,name
public class switchTo_with_frame {
	   public static void main(String argsp[])
	   {
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://rahulshettyacademy.com/AutomationPractice");
		   driver.manage().window().maximize();
		   
		   //store parent wondow info
		  String parentWidow = driver.getWindowHandle();
		  
		  Set<String> allwindow=driver.getWindowHandles();
		  
		  WebElement framElement=driver.findElement(By.name("iframe-name"));
		  
		  //switch to frame using id,class or xpath
		  driver.switchTo().frame(framElement);
		  
		  //now perform action of iframe
		  driver.findElement(By.linkText("Courses")).click();
		  
		  //switch back to main content
		  driver.switchTo().defaultContent();
		    
	   }
			
	}
