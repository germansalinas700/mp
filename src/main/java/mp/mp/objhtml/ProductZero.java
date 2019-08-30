package mp.mp.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductZero extends PageObject {
	
	private WebElement productzero = driver.findElement(By.cssSelector(".product-layout:nth-child(2) .img-responsive"));
/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/a[1]/img[1]
	public ProductZero(WebDriver driver) {
		super(driver);
	}
   	
	public boolean isInitialized() {
		return this.productzero.isDisplayed();
	}
	
	public ProductPrice ClickProductZero(){
		this.productzero.click();
		return new ProductPrice(driver);
	}
	
}
