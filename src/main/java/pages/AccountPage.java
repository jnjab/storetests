package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class AccountPage extends BasePage {
	
	public void setNome(String nome) {
		write("nome",nome);
	}
	
	public void triggerSave() {
		clickButton(By.xpath("//button[.='Salvar']"));
	}
	
	public void addAccount(String nome) {
		setNome(nome);
		triggerSave();
	}

	public void removeAccount(String value) {
		clickTableCellButton("Conta",value, "Ações", "tabelaContas","//*[@id='tabelaContas']/tbody/tr[contains(.,'"+value+"')]/td[2]/a[2]");	
	}

}
