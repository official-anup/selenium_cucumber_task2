package TestNg;

import org.testng.annotations.Test;

public class testNG_attributes {
	
	
	@Test(description = "This is for login",priority = 1)
	void login() {
		System.out.println("This is login method");
	}

	
	@Test(timeOut = 200,priority = 2)
	void show() throws InterruptedException {
		System.out.println("In show");
//		Thread.sleep(400); // it will wait for 400 which is more than 200 so it will fail	
	}
	
	
	@Test(dependsOnMethods =("login")) //it will execute after login
	void home() {
		System.out.println("in home");
	}
	
	
	@Test
	void test() {
		System.out.println("in test");
	}
	
}
