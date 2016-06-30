package day13;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(priority=2)
	public void registrationTest()
	{
		System.out.println("This is for registration");
	}
	@Test(enabled=false,priority=3)
	public void logoutTest()
	{
		System.out.println("This is for logout");
	}
	@BeforeMethod
	public void fun()
	{
		System.out.println("ABCD");
	}

}
