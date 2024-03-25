package TestNG;

import org.testng.annotations.Test;
public class three {
	@Test
	public void three(){
		System.out.println("inside three");
	}
	@Test
	public void exclude(){
		System.out.println("need to exclude inside three");
	}
}
