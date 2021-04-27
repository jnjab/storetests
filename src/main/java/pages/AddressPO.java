package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import core.BasePage;
public class AddressPO extends BasePage {
		
	
	public void verifyAddress(String addressPresented, String cityPostCodePresented, String countryPresented) {
		
		  String fullAddressCheck;
		  String fullAddressPresented;
		
		String address = getText(By.className("address_address1 address_address2"));
		String cityPostCode = getText(By.className("address_city address_state_name address_postcode"));
		String country = getText(By.className("address_country_name"));
		
		fullAddressPresented = addressPresented + cityPostCodePresented + countryPresented;
		fullAddressCheck = address + cityPostCode + country;
		
		assertEquals(fullAddressPresented, fullAddressCheck);
		
		
	}
	public void proceedToCheckoutAddress() {
		clickButton(By.xpath("//*[@id='center_column']/form/p/button[@class='button btn btn-default button-medium']"));
	}

}
