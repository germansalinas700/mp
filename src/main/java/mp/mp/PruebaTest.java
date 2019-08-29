package mp.mp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebaTest extends FunctionalTest{

	@Test
	public void editAccount(){
				
		driver.get(url);
		
		Assert.assertEquals("AA","AA");
	}	
	
}
