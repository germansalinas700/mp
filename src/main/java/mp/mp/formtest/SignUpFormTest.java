package mp.mp.formtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import mp.mp.objhtml.FunctionalTest;
import mp.mp.objhtml.ReceiptButtom;
import mp.mp.objhtml.SignUpButtomLogin;
import mp.mp.objhtml.SignUpEmail;
import mp.mp.objhtml.SignUpLoginOption;
import mp.mp.objhtml.SignUpMyAccount;
import mp.mp.objhtml.SignUpPassword;

public class SignUpFormTest extends FunctionalTest {

	@Test
	public void signUp(){
				
		driver.get(url);
		
		SignUpMyAccount sUMA = new SignUpMyAccount(driver);
		Assert.assertTrue(sUMA.isInitialized());
		
		SignUpLoginOption sULO = new SignUpLoginOption(driver);
		Assert.assertTrue(sULO.isInitialized());
		
		SignUpEmail sEMAIL = new SignUpEmail(driver);
		Assert.assertTrue(sEMAIL.isInitialized());
		sEMAIL.enterEmail("gs.salinas@gmail.com");
		
		SignUpPassword sPASS = new SignUpPassword(driver);
		Assert.assertTrue(sPASS.isInitialized());
		sPASS.enterPassword("darlina217");

		SignUpButtomLogin sBUTT = new SignUpButtomLogin(driver);
		Assert.assertTrue(sBUTT.isInitialized());
		ReceiptButtom rBUTT=sBUTT.submit();

		Assert.assertEquals("My Account", rBUTT.confirmationText());
		
	}	
}