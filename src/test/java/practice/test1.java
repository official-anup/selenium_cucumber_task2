package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test1 {
	
	public static void main(String args[]) 
	{
		
		// for title match
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
		
//		String actualTitle=driver.getTitle();
//		String expectedTitle="Facebook";
//		
//		if(expectedTitle.equalsIgnoreCase(actualTitle))
//		{
//			System.out.println("title matched");
//		}
//		
//		else 
//		{
//		  System.out.println("title does not matched");	
//		}
	  	
// ////////////////////////////////////////////
		// for url match 
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
    String actualUrl=driver.getCurrentUrl();
    String expectedUrl="https://www.facebook.com/";
    
    Assert.assertEquals(actualUrl, expectedUrl);
    System.out.println("matched");
		
		
		
		
		
		
	}

}
