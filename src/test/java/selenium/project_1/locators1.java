package selenium.project_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String args[]) 
	{
	 
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com");
	  
	  // by id
//	  WebElement ele= driver.findElement(By.id("email"));
//	  ele.click();
	  
	  // just to click and not send  key
//	  driver.findElement(By.id("email")).click();
//	  ele.sendKeys("Anup");
	  
	  
//	  by name  
//	 WebElement ele= driver.findElement(By.name("email"));
//	 ele.sendKeys("anup@gmail.com");
//	  
	  
	  
//	  by classname,there is nto class name "inputtext"
//	  WebElement ele= driver.findElement(By.className("inputtext"));
//	  ele.sendKeys("by name");
//	  
	  
	  
// by selector
//    driver.findElement(By.cssSelector("#_R_1h6kqsqppb6amH1_")).sendKeys("heeelooo");  //click for email
	  
//    driver.findElement(By.cssSelector("#_R_1hmkqsqppb6amH1_")).click();  //click for pass
	  
	  
//	 by xpath,working but have to update
//	  driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]")).sendKeys("hello xpath");
	  
	  
	
// below 2 tags only works for text which has text between anchor tag,not with other tags
	 
//	  by link text,working
//	  driver.findElement(By.linkText("Create new account")).click();

//	  link text but dont need to write all text
//	  driver.findElement(By.partialLinkText("Create ne")).click();
	  
	  
	  
	 
	  
	  
	  
	  
	}
}
