package selenium.project_1;

import java.awt.Adjustable;
import java.awt.desktop.OpenFilesEvent;
import java.awt.print.Printable;
import java.security.PublicKey;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Test_1 {
//
//    public static void main(String[] args) {
//
//
//        // Launch Chrome browser
//        WebDriver driver = new ChromeDriver();
//
//        // Open Facebook login page
//        driver.get("https://www.facebook.com/");
//
//        // Expected title
//        String expTitle = "Facebook – log in or sign up";
//
//        // Actual title
//        String actualTitle = driver.getTitle();
//
//        // Title validation
//        if (expTitle.equalsIgnoreCase(actualTitle)) {
//            System.out.println("Title match");
//        } else {
//            System.out.println("User on wrong page");
//        }
//
//        // Expected URL
//        String expUrl = "https://www.facebook.com/";
//
//        // Actual URL
//        String actUrl = driver.getCurrentUrl();
//
//        // URL validation
//        if (expUrl.equalsIgnoreCase(actUrl)) {
//            System.out.println("URL match");
//        } else {
//            System.out.println("URL not match");
//        }

        // Close browser
//        driver.quit();
//
//    }
//}

 /*       
//////////////  test 2////////////////////
///
 */
//
//public class Test_1{
//	
//	public static void main(String[] args) {
//		
//		Open brow
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.facebook.com");
//		
		// find and store ele
//		WebElement ele=driver.findElement(By.id("email"));
//		ele.click();
//		ele.sendKeys("anup@gmail.com");
		
		
		//just click by id
//		driver.findElement(By.id("email")).click();
		
//		just click by class
//		driver.findElement(By.className("inputtext")).sendKeys("hello");
		
		//just click by name 
//		driver.findElement(By.name("email")).sendKeys("anup");
		
		//just click by css selector
//		driver.findElement(By.cssSelector("#email")).sendKeys("css");
		
		//just click by xpath
//		driver.findElement(By.xpath(null));

// find ele by linktext
		
		
		// quit the driver
//		driver.quit(); //close all tabs
//		driver.close(); // close current 


//	}
//}


/*
///////////// basic commands ///////////////////
        
*/



public class Test_1{

  public static void main(String[] args) throws InterruptedException {

	  //	Open brow
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
//	// find and store ele
//	WebElement ele=driver.findElement(By.id("email"));
//	ele.click();
//	ele.sendKeys("anup@gmail.com");
	
	// quit the driver
//	driver.quit(); //close all tabs
//	driver.close(); // close current 
	
//	driver.findElement(By.linkText("Create Page")).click();
	
//	driver.navigate().to("https://www.facebook.com");
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.navigate().forward();
	
	
	
	// find and store ele and clear
//	WebElement ele=driver.findElement(By.id("email"));
//	ele.click();
//	ele.sendKeys("anup@gmail.com");
//	Thread.sleep(5000);
//	ele.clear();
	
	
//	submit
	WebElement ele=driver.findElement(By.id("email"));
	if (ele.isDisplayed() && ele.isEnabled()) {
		ele.click();
		ele.sendKeys("anup@gmail.com");
	}
	driver.findElement(By.cssSelector("#pass")).sendKeys("hello");
	
	
	driver.findElement(By.name("login")).submit();
	
}

}
