package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class LoginPO extends BasePage {
		
	public void setEmail(String email) {
		write("email",email);
	}
	
	public void setPassword(String senha) {
		write("passwd",senha);
	}

	public void signIn() {
		clickButton(By.id("SubmitLogin")); 
	}
	
	public void Login(String email, String senha) {
		setEmail(email);
		setPassword(senha);
		signIn();
	}



}
