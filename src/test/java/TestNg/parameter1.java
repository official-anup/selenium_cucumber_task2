package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter1 {
	
	
	@Parameters({"c","d"})
	@Test
	void show1(int a,int b) {
		System.out.println("a :"+a +"   b :"+b);
	}
	
	@Parameters({"a","b"})
	@Test
	void show2(int c,int d) {
		System.out.println("c :"+c +"   d :"+d);
	}

}
