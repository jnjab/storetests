package pages;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class InicialScreenPO extends BasePage {
	
	public void acessInitialScreen() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php");
	}
	
	public void clickSignIn() {
		clickButton(By.xpath("//*/a[@class='login']"));
	}

}
