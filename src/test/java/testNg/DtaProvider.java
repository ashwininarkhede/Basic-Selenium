package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DtaProvider {
	@Test(dataProvider = "getData")
	public void data(String name,int price)
	{
		System.out.println("Phone is:" +name+" price is" +price);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="iphone";
		data[0][1]=30000;
		data[1][0]="sumsung";
		data[1][1]=20000;
		data[2][0]="oopo";
		data[2][1]=10000;
		return data;
	}

}
