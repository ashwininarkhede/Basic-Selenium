package Basic;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsseart {
	@Test
	public void m1()
	{
		System.out.println("step-1");
		System.out.println("step-2");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(false, false);//both are same not showing exception,not same exp found
		System.out.println("step-3");
		System.out.println("step-4");
		soft.assertAll();
		
		
	}

}
//exception will come after execution in softAssert
//but in hardAssert exception will come (soft.assertEquals(false, false);)for that line execution is stop force fully
