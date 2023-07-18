package testNg;

import org.testng.annotations.Test;

public class TestNgPracticeTest {
	@Test(invocationCount = 2,priority = 1)//default invocationCount is 1
	public void createUser()
	{
		System.out.println("user is created");
	}
	@Test(priority = -1)
	public void modifyUser()
	{
		System.out.println("user is modified");
	}
	@Test(priority = 0)
	public void deleteUser()
	{
		System.out.println("user is deleted");
	}
//if we want to disable any method we write (enable=false)
}
