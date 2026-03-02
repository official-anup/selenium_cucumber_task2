package TestNg;

import org.testng.annotations.Test;

public class test1 {
	
	@Test(groups = {"smoke"})
	void show() {
		System.out.println("show ");
	}
	
	@Test(groups = {"smoke","sanity"})
	void show1() {
		System.out.println("show 1");
	}
	
	@Test(groups = {"regression"})
	void show2() {
		System.out.println("show 2");
	}
	
	
	
	@Test(groups = {"sanity"})
	void display() {
		System.out.println("display =>sanity and smoke");
	}
	

}
