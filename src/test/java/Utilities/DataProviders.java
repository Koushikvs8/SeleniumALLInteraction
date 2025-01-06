package Utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
/// Data providerby object arry //////
	
	@DataProvider(name="ddt" )
	public Object[][] Data()
	{
		Object[][] data= {{"koushik", "gfgfhjg"},
		{"swathi1233", "gfgfhjg"},
		{"swfhjfj", "gfgfhjg"}
		};
		
		
		
		return data;
	}
}
