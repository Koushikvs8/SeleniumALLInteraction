package Utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
/// Data providerby object arry //////
	@DataProvider(name="login",parallel = true)
	public static Object[][] loginData()
	{
		Object[][] data= {
				{"koushik","Kou@12345"},
				{"swathi_salimath" ,"Swathi@1234"},
				{"salimath" ,"Swathi@1sdf234"}
		};
		return data;
	}
}
