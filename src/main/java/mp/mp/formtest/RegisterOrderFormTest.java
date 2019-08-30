package mp.mp.formtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import mp.mp.objhtml.AgreeClause;
import mp.mp.objhtml.CartButton;
import mp.mp.objhtml.CheckOutButton;
import mp.mp.objhtml.ConfirmButton;
import mp.mp.objhtml.FunctionalTest;
import mp.mp.objhtml.PaymentButton;
import mp.mp.objhtml.PaymentMethodButton;
import mp.mp.objhtml.ProductPrice;
import mp.mp.objhtml.ProductZero;
import mp.mp.objhtml.ReceiptButtom;
import mp.mp.objhtml.SearchBar;
import mp.mp.objhtml.SearchBarButtom;
import mp.mp.objhtml.ShippingButton;
import mp.mp.objhtml.ShippingMethodButton;
import mp.mp.objhtml.SignUpButtomLogin;
import mp.mp.objhtml.SignUpEmail;
import mp.mp.objhtml.SignUpLoginOption;
import mp.mp.objhtml.SignUpMyAccount;
import mp.mp.objhtml.SignUpPassword;



public class RegisterOrderFormTest extends FunctionalTest {

	@Test
	public void RegisterOrder(){
				
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
		
		SearchBar sBAR = new SearchBar(driver);
		Assert.assertTrue(sBAR.isInitialized());
		sBAR.enterSearch("mac");
		
		
		SearchBarButtom bBUTT = new SearchBarButtom(driver);
		Assert.assertTrue(bBUTT.isInitialized());
		
		ProductZero pZERO=bBUTT.submit();
		Assert.assertTrue(pZERO.isInitialized());
		ProductPrice pPRIC =pZERO.ClickProductZero();
		
		Assert.assertEquals("Ex Tax: $1,000.00",pPRIC.getValueProductPrice().trim());
		
		CartButton cBUTT = new CartButton(driver);
		Assert.assertTrue(cBUTT.isInitialized());
		cBUTT.CartButtonClick();
		
		CheckOutButton kBUTT = new CheckOutButton(driver);
		Assert.assertTrue(kBUTT.isInitialized());
		kBUTT.CheckOutButtonClick();
		
				
		PaymentButton pBUTT = new PaymentButton(driver);
 		Assert.assertTrue(pBUTT.isInitialized());
		pBUTT.PaymentButtonClick();
		
		ShippingButton spBUTT = new ShippingButton(driver);
		Assert.assertTrue(spBUTT.isInitialized());
		spBUTT.ShippingButtonClick();
		
		ShippingMethodButton spmBUTT = new ShippingMethodButton(driver);
		Assert.assertTrue(spmBUTT.isInitialized());
		spmBUTT.ShippingMethodButtonClick();
		
		AgreeClause aBUTT = new AgreeClause(driver);
		Assert.assertTrue(aBUTT.isInitialized());
		aBUTT.AgreeClauseClick();
		
		PaymentMethodButton pmbBUTT = new PaymentMethodButton(driver);
		Assert.assertTrue(pmbBUTT.isInitialized());
		pmbBUTT.PaymentMethodButtonClick();
		
		ConfirmButton cmfBUTT = new ConfirmButton(driver);
		Assert.assertTrue(cmfBUTT.isInitialized());
		cmfBUTT.ConfirmButtonClick(); 
		
		
	}	
}
