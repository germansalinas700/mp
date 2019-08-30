package mp.mp.formtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import mp.mp.objhtml.EditButtom;
import mp.mp.objhtml.EditFax;
import mp.mp.objhtml.EditFirstName;
import mp.mp.objhtml.EditLastName;
import mp.mp.objhtml.EditTelephone;
import mp.mp.objhtml.FunctionalTest;
import mp.mp.objhtml.ReceiptButtom;
import mp.mp.objhtml.SignUpButtomLogin;
import mp.mp.objhtml.SignUpEditAccount;
import mp.mp.objhtml.SignUpEmail;
import mp.mp.objhtml.SignUpLoginOption;
import mp.mp.objhtml.SignUpMyAccount;
import mp.mp.objhtml.SignUpPassword;


public class EditAccountFormTest extends FunctionalTest {

	@Test
	public void editAccount(){
				
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
		
		SignUpEditAccount eACC = new SignUpEditAccount(driver);
		Assert.assertTrue(eACC.isInitialized());
		
		EditFirstName fNAM = new EditFirstName(driver);
		Assert.assertTrue(fNAM.isInitialized());
		fNAM.enterFirstName("German");
		
		EditLastName lNAM = new EditLastName(driver);
		Assert.assertTrue(lNAM.isInitialized());
		lNAM.enterLastName("Salinas");
		
		SignUpEmail eEMAIL = new SignUpEmail(driver);
		Assert.assertTrue(eEMAIL.isInitialized());
		eEMAIL.enterEmail("gs.salinas@gmail.com");
		
		EditTelephone tPHO = new EditTelephone(driver);
		Assert.assertTrue(tPHO.isInitialized());
		tPHO.enterTelephone("+56956455465");
		
		EditFax eFAX = new EditFax(driver);
		Assert.assertTrue(eFAX.isInitialized());
		eFAX.enterFax(" ");
		
		EditButtom eBUTT = new EditButtom(driver);
		Assert.assertTrue(eBUTT.isInitialized());
		rBUTT=eBUTT.submit();

		Assert.assertEquals("My Account", rBUTT.confirmationText());
		
	}	
}