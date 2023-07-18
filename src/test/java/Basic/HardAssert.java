package Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void m1()
	{
		System.out.println("step-1");
		System.out.println("step-2");
		Assert.assertEquals(false, false);
		System.out.println("step-3");
		System.out.println("step-4");
	}
	@Test
    public void m2()
    {
		String act = "Ashwini";
		String exp = "Megha";
		Assert.assertEquals(act, exp);
    	
    }
	

}
