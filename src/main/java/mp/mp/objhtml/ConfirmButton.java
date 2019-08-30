package mp.mp.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmButton extends PageObject {
	
    private WebElement confirmbutton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[2]/div[1]/input[1]"));
	
	public ConfirmButton(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(confirmbutton));
		return this.confirmbutton.isDisplayed();
	}
	
	public void ConfirmButtonClick(){
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", confirmbutton);
		
	}
		
}