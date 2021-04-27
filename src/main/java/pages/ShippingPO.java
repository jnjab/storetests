package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class ShippingPO extends BasePage {
		
	
	public void checkTermsOfServices() {
		clickCheck("cgv"); 
	}
	public void proceedToCheckoutShipping() {
		clickButton(By.xpath("//*/button[@class='button btn btn-default standard-checkout button-medium']"));
	}
}
