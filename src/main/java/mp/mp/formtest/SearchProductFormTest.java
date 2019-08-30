package mp.mp.formtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import mp.mp.objhtml.FunctionalTest;
import mp.mp.objhtml.ProductPrice;
import mp.mp.objhtml.ProductZero;
import mp.mp.objhtml.ReceiptButtom;
import mp.mp.objhtml.SearchBar;
import mp.mp.objhtml.SearchBarButtom;
import mp.mp.objhtml.SignUpButtomLogin;
import mp.mp.objhtml.SignUpEmail;
import mp.mp.objhtml.SignUpLoginOption;
import mp.mp.objhtml.SignUpMyAccount;
import mp.mp.objhtml.SignUpPassword;



public class SearchProductFormTest extends FunctionalTest {

	@Test
	public void searchProduct(){
				
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
		sBAR.enterSearch("Samsung");
		
		
		SearchBarButtom bBUTT = new SearchBarButtom(driver);
		Assert.assertTrue(bBUTT.isInitialized());
		
		ProductZero pZERO=bBUTT.submit();
		Assert.assertTrue(pZERO.isInitialized());
		ProductPrice pPRIC =pZERO.ClickProductZero();
				
		System.out.println("PRODUCT PRICE"+pPRIC.getValueProductPrice().trim());
		Assert.assertEquals("Ex Tax: $200.00",pPRIC.getValueProductPrice().trim());
		
	}	
}