package selenium.project_1;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.page.model.WebAppManifest;

public class basic_commands {

	public static void main(String args[])
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com");
		
		try {
			
//			driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys("demo search");
//			System.out.println("Element found"); 
			
//  //////////////////////////////////////	
			
//			driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys("demo search");
			
//			driver.quit();
			
//		    driver.navigate().to("\"https:/www.facebook.com\""); // same as driver.get
		
			
//  //////////////////////////////////////	
			
//		driver.findElement(By.linkText("Create new account")).click();
//		driver.navigate().back();
			
//  ////////////////make sure that to send keys ,text box should be enabled and displayed//////////////////////	
			
//		WebElement ele= driver.findElement(By.name("email"));
//		if(ele.isDisplayed() && ele.isEnabled()) 
//		{
//			ele.click();
//			ele.sendKeys("test for clear");	
//		}
//
//		ele.clear();
			
			
//  //////////////////////////////////////	
			
//	WebElement ele= driver.findElement(By.name("email"));
//	ele.sendKeys("email");
//	driver.findElement(By.name("pass")).sendKeys("pass");
//	driver.findElement(By.linkText("Log in")).submit(); // i cant use submit because login button is not inside form,so use click
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[1]")).click();
//		
			
//  ///////////// gettext/////////////////////////				

//	String val= driver.findElement(By.xpath("//span[text()='Log in to Facebook']")).getText();
//    System.out.print("text value :"+val);
		
		
//  //////////////////////////////////////	

WebElement ele= driver.findElement(By.name("email"));
//System.out.print("tagname :"+ele.getTagName());
//System.out.print("color :"+ele.getCssValue("color")); // we can use other css values,like text-align,font-size
//System.out.print("attributes :"+ele.getAttribute("name"));





//Dimension d=ele.getSize();
//System.out.println("witdh :"+d.getWidth());
//System.out.println("height :"+d.getHeight());
 
//Point p=ele.getLocation();
//System.out.println("x :"+p.getX());
//System.out.println("y :"+p.getY());

//  //////////////////////////////////////				

		
		}
	    
		catch (Exception e) {
			System.out.println("Element not found :"+e.getMessage());
		}
	
	
	}
	
	
}
