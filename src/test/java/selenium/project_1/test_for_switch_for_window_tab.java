package selenium.project_1;

import org.openqa.selenium.By;

public class test_for_switch_for_window_tab extends base_test{
	 
	   static By openWindowButtonByte=By.id("openwindow");
	   static By coursesLink=By.linkText("Courses");	
		
	   public static void main(String args[]) 
	   {
		   test_for_switch_for_window_tab  obj=new test_for_switch_for_window_tab();
		   
		   obj.setUp();
		   
		   obj.clickElement(openWindowButtonByte);
		   
//		   obj.switchToWindowByIndex(driver,1);
//		   System.out.println(driver.getTitle());
		   obj.switchToWindowBytitle(driver, "QAClick Academy - A Testing Academy to Learn, Earn and Shine");
//		   obj.clickElement(coursesLink);
		   
//		   System.out.println(driver.getTitle()); //title of current page
//		   obj.switchToWindowByIndex(driver, 0);
	   }	
	}
