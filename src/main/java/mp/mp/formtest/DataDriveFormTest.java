package mp.mp.formtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import mp.mp.objhtml.FunctionalTest;
import mp.mp.objhtml.LogoutOption;
import mp.mp.objhtml.ReceiptButtom;
import mp.mp.objhtml.SignUpButtomLogin;
import mp.mp.objhtml.SignUpEmail;
import mp.mp.objhtml.SignUpLoginOption;
import mp.mp.objhtml.SignUpMyAccount;
import mp.mp.objhtml.SignUpPassword;

public class DataDriveFormTest extends FunctionalTest {

	@Test
	public void DataDriveOrder() throws IOException {
				
		
		File fdata=new File("data.xlsx");
		
		FileInputStream finput = new FileInputStream(fdata);
		
		XSSFWorkbook workbook = new XSSFWorkbook(finput);
		
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		XSSFCell cellxlsx;
		
		driver.get(url);
		
		
		for(int i=0; i<=sheet.getLastRowNum(); i++)
		{
			
			SignUpMyAccount sUMA = new SignUpMyAccount(driver);
			Assert.assertTrue(sUMA.isInitialized());
		
			SignUpLoginOption sULO = new SignUpLoginOption(driver);
			Assert.assertTrue(sULO.isInitialized());
		
			cellxlsx = sheet.getRow(i).getCell(0);
			cellxlsx.setCellType(CellType.STRING);
			SignUpEmail sEMAIL = new SignUpEmail(driver);
			Assert.assertTrue(sEMAIL.isInitialized());
			sEMAIL.enterEmail(cellxlsx.getStringCellValue());
			
			cellxlsx = sheet.getRow(i).getCell(1);
			cellxlsx.setCellType(CellType.STRING);
			SignUpPassword sPASS = new SignUpPassword(driver);
			Assert.assertTrue(sPASS.isInitialized());
			sPASS.enterPassword(cellxlsx.getStringCellValue());
			
			SignUpButtomLogin sBUTT = new SignUpButtomLogin(driver);
			Assert.assertTrue(sBUTT.isInitialized());
			ReceiptButtom rBUTT=sBUTT.submit();

			Assert.assertEquals("My Account", rBUTT.confirmationText());
			
			Assert.assertTrue(sUMA.isInitialized());
			
			LogoutOption sLUT = new LogoutOption(driver);
			Assert.assertTrue(sLUT.isInitialized());
		
			
		}	
	}	
}