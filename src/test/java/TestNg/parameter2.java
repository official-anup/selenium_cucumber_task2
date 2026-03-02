package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter2 {

	@Parameters({"c","d"})
	@Test
	void show1(int a,int b) {
		System.out.println("a :"+a +"   b :"+b);
	}
}
