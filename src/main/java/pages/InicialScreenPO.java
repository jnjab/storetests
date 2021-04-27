package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.BasePage;
import core.DriverFactory;

public class InicialScreenPO extends BasePage {

	public void acessInitialScreen() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php");
	}

	public void clickSignIn() {
		clickButton(By.xpath("//*/a[@class='login']"));
	}

	public void setTxtsearch(String text) {
		write("search_query_top", text);
	}

	public void clickSearch() {
		clickButton(By.name("submit_search"));
	}

	public void addCart() {
		clickButton(By.xpath("//*[@id='center_column']/ul/li/div/div/div/a[@data-id-product='1']"));
	}

	public void proceedToCheckout() {
		clickButton(By.xpath("//*[@id='layer_cart']/div/div/div/a[@class='btn btn-default button button-medium']"));
	}
	
	public void proceedToCheckoutOrder() {
		clickButton(By.xpath("//*[@id='center_column']/p/a[@class='button btn btn-default standard-checkout button-medium']"));
		
	}
	
	public void mouseOverImage() {
		mouseOver(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div"));
}
}